
import java.util.Scanner;
import java.lang.String;
import javax.swing.JOptionPane;

public class T1{
	public static void main(String[] args){
	int op,cont = 0,i;	
	Scanner input = new Scanner(System.in);

	Medicamento med = new Medicamento(); 

	
	JOptionPane.showMessageDialog(null,"Bem-Vindo ao sistema farmaceutico! Por favor, aperte Ok para entrar no menu principal");
	
	do{
	
			System.out.printf("         >>> MENU <<<\n");
			System.out.println("1. CADASTRAR UM MEDICAMENTO");
			System.out.println("2. REAJUSTE PRECO DE VENDA");
			System.out.println("3. MOSTRAR");
			System.out.println("4. SAIR");
			System.out.print("Choose an option: ");
			System.out.printf("\n\n");
			System.out.printf("\t");
			op = input.nextInt();
			System.out.printf("\n\n");
			switch(op){

				
				case 1:
					System.out.println("ENTRE AS INFORMACOES DO MEDICAMENTO");
					System.out.print("<> Nome: ");
					med.nome = input.next();

					System.out.print("<> Preco de venda: ");
					med.precoVenda = input.nextDouble();

					System.out.println("<> Data de validade ");
					System.out.print(" Dia(dd): ");
					med.dataValidade.dia = input.nextInt();
					System.out.print(" Mes(mm): ");
					med.dataValidade.mes = input.nextInt();
					System.out.print(" Ano(aaaa): ");
					med.dataValidade.ano = input.nextInt();

					System.out.printf("\n\n");
					System.out.println("<> Digite as informacoes do laboratorio <> ");
					
					System.out.print("Nome: ");
					med.laboratorio.nome = input.next();
					
					System.out.print("Razao social: ");
					med.laboratorio.razaoSocial = input.next();

					System.out.print("CNPJ: ");
					med.laboratorio.cnpj = input.next();

					System.out.print("Inscricao estadual: ");
					med.laboratorio.inscricaoEstadual = input.nextInt();

					System.out.print("Endereco: ");
					med.laboratorio.endereco = input.next();

					System.out.print("Telefone: ");
					med.laboratorio.telefone = input.next();
					System.out.printf("\n\n");

		
					med.receitaObrigatoria = true;
				
					med.vender(med.receitaObrigatoria);
					
					

					System.out.println("<> Informe a quantidade no Estoque: ");
					med.qtdEstoque = input.nextInt();
					System.out.printf("\n\n");

					cont++;
					break;
				case 2:
					
					if(cont == 0){
							JOptionPane.showMessageDialog(null,"Nao tem nenhum medicamento cadastrado. Aperte Ok para continuar");
					}
					else {
						System.out.printf("<> Digite o valor do percentual: ");
						double percent = input.nextDouble();
						med.reajustarPreco(percent);
					}
					System.out.println();

					break;
				case 3:
					if(cont == 1){
						med.mostra();
					}
					else if(cont > 1){
						System.out.print("Digite o nome do medicamento que quer mostar: ");
						String medicaProcurado = input.next();

						System.out.println("medica Procurado"+medicaProcurado);
						

						for(i = 0; i < cont; i++){

							if(medicaProcurado.equals(med.nome)){
								System.out.println("Entrou");
								med.mostra();						
							}
							else{
								JOptionPane.showMessageDialog(null,"Nao existe este medicamento. Aperte Ok para continuar");
							}
						}
					}
					else{
						JOptionPane.showMessageDialog(null,"Nao tem nenhum medicamento cadastrado. Aperte Ok para continuar");
					}
					System.out.printf("\n\n");
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Aperte Ok para finalizar");	
					break;
				default:
					JOptionPane.showMessageDialog(null,"Opcao invalida! Por favor, Digite uma outra: ");	

			}
		}while(op != 4 );


	}








}

