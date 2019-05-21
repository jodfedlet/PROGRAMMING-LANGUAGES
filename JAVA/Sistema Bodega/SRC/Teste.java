
import java.util.*;
import javax.swing.JOptionPane;

public class Teste{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Empresa emp = new Empresa();

		int op, CodBebi = 0, cli = 0;

		 int qt = 0, quantite, numero;
		 
		Funcionario f1 = new Funcionario("Jod", "068459485578","Rua A", 5000,"Suporte","01","04","2018");
		emp.contrata(f1);//primeiro funcionario
		Funcionario f2 = new Funcionario("Dukens", "58467164775","Avenida Joao XXII", 1200.56,"Atendente","05","01","2018");
		emp.contrata(f2);//segunda funcionario
		Funcionario f3 = new Funcionario("John", "067421365487","Rua Teodoro", 800.2,"Recepcionista","03","03","2018");
		emp.contrata(f3);//terceiro funcionario
		
		 
		 
		do{

			 op =Integer.parseInt(JOptionPane.showInputDialog("<> BEM-VINDO AO JOAOZIN DA BODEGA<>\n\n"+
			"*** FUNCIONARIO ***\n"+
			"		1. Cadastrar \n"+
			"		2. Exibir \n\n"+
			"*** BEBIDA***\n"+
			"		3. Cadastrar\n"+
			"		4. Mostrar\n"+
			"		5. Comprar\n"+
			"		6. vender\n\n"+
			"*** CLIENTE***\n"+
			"		7. Cadastrar\n"+
			"		8. Mostrar\n\n"+
			"*** 0.SAIR  ***\n\n"+
			"Choose an option: \n"));
;

			System.out.printf("\n\n");


			switch(op){


				case 1:

					//Cadastro de funcionarios
					System.out.println("Informe o dados do funcionario: ");
					System.out.print("Nome: ");
					String nome = input.nextLine();

					System.out.println();
					System.out.print("CPF: ");
					String cpf = input.nextLine();

					System.out.println();
					System.out.print("Endereco: ");
					String endereco = input.nextLine();

					System.out.println();
					System.out.print("Salario: ");
					double salario = input.nextDouble();
					input.nextLine();

					System.out.println();
					System.out.print("Cargo: ");
					String cargo = input.nextLine();

					System.out.println();
					System.out.println("Data de entrada");
					System.out.print(">Dia(ex: 01): ");
					String dia = input.nextLine();

					System.out.print(">Mes(ex: 12): ");
					String mes = input.nextLine();

					System.out.print(">Ano(ex: 2015): ");
					String ano = input.nextLine();

					Funcionario funcionario = new Funcionario(nome, cpf,endereco, salario,cargo,dia,mes,ano);
					emp.contrata(funcionario);
					System.out.printf("\n\n");
					break;

				case 2:
					//Lista bodegueiros

					emp.listaBodegueiros();
					System.out.printf("\n\n");
					break;

				case 3:
					//cadastro de bebidas
					System.out.println("Digite as informacoes da bebida: ");
					System.out.print("Nome: ");
					String nom = input.next();

					System.out.println();
					System.out.print("Teor alcoolico: ");
					int teorAlc = input.nextInt();
							
					System.out.println();
					System.out.print("Quantidade(Ml): ");
					int qtMl = input.nextInt();

					System.out.println();
					System.out.print("Quantidade no estoque: ");
					int qtEstoque = input.nextInt();

					System.out.println();
					System.out.print("Preco : ");
					double precoVenda = input.nextDouble();

					CodBebi++;
					qt++;
					Bebida b = new Bebida(nom,teorAlc,qtMl,qtEstoque,precoVenda,CodBebi);
					emp.beb.add(b);


					System.out.printf("\n\n");
					break;

				case 4:
						//mostrar bebida
						Iterator<Bebida> ite = emp.beb.iterator();
						System.out.println("=======================================");
						System.out.println("Bebidas Disponiveis");
						System.out.println("Quantidade: "+qt);
						System.out.println("=======================================");
						while(ite.hasNext()){
							 b = ite.next();

							 b.mostraBebida();

							System.out.println("____________________________________");
							System.out.println();
						}
						System.out.printf("\n\n");
						break;

				case 5:
						//Compra bebida
						if(qt>0){
							System.out.print("Digite um codigo valido: ");
							numero = input.nextInt();

							Iterator<Bebida> iter = emp.beb.iterator();

							while(iter.hasNext()){
								 b = iter.next();
								 

								 
								if(b.verificaCompra(numero) == true){
								
										System.out.print("Quantas? ");
										quantite = input.nextInt();
										      b.compra(quantite);
		        
											   
								}
		                   
						

						
							}
						}
						else{
							System.out.println("Nao tem bebida disponivel!");
						}	
						System.out.printf("\n\n");
						 break;

				case 6:
						//Venda de  bebida
						if(CodBebi>0){
								System.out.print("Digite um codigo valido: ");
								 numero = input.nextInt();

								Iterator<Bebida> itera = emp.beb.iterator();

								while(itera.hasNext()){
									 b = itera.next();
									 

									 if(b.confereEstoque()==true){
											if(b.verificaVenda(numero) == true){
												
													System.out.print("Quantas? ");
													 quantite = input.nextInt();
														  b.vender(quantite);
														   
											}
									}
									

								
								}
						}
						else{
									System.out.println("Nao ha nenhuma bebida!");
						}	
					System.out.printf("\n\n");
					break;
						

				case 7:
						//Cadastrar Cliente
					System.out.println("Informe o dados do cliente: ");
					System.out.print("Nome: ");
					String nomeCl = input.next();
                    

					System.out.print("CPF: ");
					String cpfCl = input.next();
					

                    
                    boolean fiad = true;
                    
                            
					cli++;
					Cliente cl = new Cliente(nomeCl,cpfCl,fiad,cli);
					emp.client.add(cl);

					System.out.printf("\n\n");
					break;
				case 8:
						//mostrar cliente
						Iterator<Cliente> k = emp.client.iterator();
						while(k.hasNext()){
							cl = k.next();
							cl.mostrarCliente();
							System.out.println();

                            
						}

						System.out.printf("\n\n");
						break;
				case 0:
						JOptionPane.showMessageDialog(null,"Aperte ok para finalizar");
						break;
				default:
					JOptionPane.showMessageDialog(null,"Opcao invalida! Por favor, repete uma nova: ");

			}
		}while(op != 0 );


	}

}
