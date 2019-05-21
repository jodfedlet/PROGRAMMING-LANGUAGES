import java.util.*;
import javax.swing.JOptionPane;
import java.util.Date;//data gerou automaticamente
public class Blog{

	static Scanner input = new Scanner(System.in);

	static List <Post> liste = new ArrayList <Post> ();
	 
		//metodo para exibir
		public void showAll(int posicao ){
			
				Iterator <Post> p = liste.iterator();
				Post pos;
				System.out.println("\n\n~~~~~~~~~~~~~~~~~---~~~~~~~~~~\n"+
										"           All Posts//\n"+
									"~~~~~~~~~~~~~~~~~----~~~~~~~~~~\n");
				
					while(p.hasNext()){
			
						 pos = p.next();
							pos.show();
		
						System.out.printf("Posicao: %d\n\n",posicao);
						System.out.printf("--------------------------------\n\n");
						posicao++;
					}
	
				 	
					
				
				
				System.out.printf("=======================================================================\n\n");
		}
		//método para ler uma postagem
		public void readData(Post p){
			Date date = new Date();
			int l = 0, dl = 0;
			String title, content, source,brand;
			int like, dislike, stars;

			if(p instanceof News){

				News p1 = (News)p; //downcasting|| convertendo news para Post
				System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~\n"+
										"//Enter News' datas//\n"+
									"~~~~~~~~~~~~~~~~~~~~~~~~\n");
				System.out.print("Title: ");
				title = input.next();
				p1.setTitle(title);
			
				System.out.print("Content: ");
				content = input.next();
				p1.setContent(content);

				System.out.print("Source: ");
				source = input.next();
				p1.setSource(source);

				p1.setLikes(l);
				p1.setDislikes(dl);
			
				p1.setDate(date);
			
			}
			else if(p instanceof ProductReview){
				ProductReview p2 = (ProductReview)p; //downcasting|| convertendo ProductReview para Post
				System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
										"//Enter Product Review datas//\n"+
									"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				System.out.print("Title: ");
				title = input.next();
				p2.setTitle(title);
			
				System.out.print("Content: ");
				content = input.next();
				p2.setContent(content);

				System.out.print("Brand: ");
				brand = input.next();
				p2.setBrand(brand);
			
				System.out.print("Stars: ");
				stars = input.nextInt();
				p2.setStars(stars);

				p2.setLikes(l);
				p2.setDislikes(dl);
				
				p2.setDate(date);

				System.out.print("Enter the value: ");
				int value = input.nextInt();
				if (value <= 10 && value > 1){
					p2.evaluate(value);			
				}		
			}
			else if (p instanceof Post){

				Post po = p;
				System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~\n"+
										"//Enter Others datas//\n"+
									"~~~~~~~~~~~~~~~~~~~~~~~\n");
				System.out.print("Title: ");
				title = input.next();
				po.setTitle(title);
			
				System.out.print("Content: ");
				content = input.next();
				po.setContent(content);

				po.setLikes(l);
				po.setDislikes(dl);
			
				po.setDate(date);
		
			}

		}

	public static void main(String[] args) {
		
		int op;
		
		Blog b = new Blog();
		Post newpost = new Post();

		do{

			 op =Integer.parseInt(JOptionPane.showInputDialog("BLOG: O que voce quer fazer?\n\n"+
			"1 - Novo post de noticia\n\n"+
			"2 - Nova resenha de produto\n\n"+
			"3 - Novo post de outros assuntos\n\n"+
			"4 - Listar todas as postagens\n\n"+
			"5 - Curtir uma postagem\n\n"+
			"6 - Nao curtir uma postagem\n\n"+
			"10 - sair\n\n"+
			"Escolha uma opcao: \n"));

			 switch(op){
			 	
				
			 	case 1 ://novo post de noticia
			 		
			 		News nouvelle = new News();
			 		Post nouv = nouvelle;
			 		b.readData(nouv);
			 		Blog.liste.add(nouv);
			 		break;

			 	case 2 ://nova resenha de produto

			 		ProductReview journal = new ProductReview();
			 		Post jour = journal;
			 		b.readData(jour);
			 		Blog.liste.add(jour);
			 		
			 		break;
			 	case 3 : // Novo post de outros assuntos
			 		
			 		b.readData(newpost);
			 		Blog.liste.add(newpost);
			 		break;

			 	case 4 : // listar todas as postagens
			 			if(b.liste.size() > 0){//verifica se a lista tem elemento
			 				b.showAll(0);
			 			
			 			}else{
							System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~\n"+
										"//Lista vazia//\n"+
									"~~~~~~~~~~~~~~~~~~~~~~~\n");

						}
			 		break;

			 	case 5 :// curtir uma postagem

			 		if(b.liste.size() > 0){//verifica se a lista tem elemento
				 		System.out.print("Entre o codigo da postagem: ");
				 		int code = input.nextInt();

								
								if(code < 0 || code > (liste.size()-1) ){
									System.out.println("Codigo invalido");
								}
				 				else{
									newpost = liste.get(code);
									newpost.like();
								}
										
									
								
						
					}
					else{
						System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~\n"+
										"//Lista vazia//\n"+
									"~~~~~~~~~~~~~~~~~~~~~~~\n");

					}
			 		break;

			 	case 6 : //nao curtir postagem
					
					if(b.liste.size() > 0){//verifica se a lista tem elemento
				 		System.out.print("Entre o codigo da postagem: ");
				 		int cod = input.nextInt();
				 				Post post = new Post();
				 				if(cod < 0 || cod > (liste.size()-1)) {
									System.out.println("Codigo invalido");
								}
				 				else{
									newpost = liste.get(cod);
									newpost.dislike();
								}
								
									
							
						
					}
					else{
						System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~\n"+
										"//Lista vazia//\n"+
									"~~~~~~~~~~~~~~~~~~~~~~~\n");

					}
			 		break;
			 	case 10 : //sair do programa
					break;
			 	
			 	default :
			 		System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~\n"+
										"//Unvailable option//\n"+
									"~~~~~~~~~~~~~~~~~~~~~~~\n");


			 }


		}while(op != 10);

	}



}