import java.util.*;

public class Teste1{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Matematica mat = new Matematica();//instanciar objeto da classe matematica

		int op;
		double resultado, a, b;
		try{
			do{
				//system("clear");
				System.out.printf("\n\n****Menu****\n\n1 - Somar\n\n2 - Subtrair\n\n3 - Multiplicar\n\n4 - Dividir\n\n0 - Sair\n\n");
				System.out.printf("Digite uma opcao: ");
				op = input.nextInt();

				if (op == 1) {
					System.out.printf("Digite o 1o numero: ");
					a = input.nextDouble();
		

					System.out.printf("Digite o 2o numero: ");
					b = input.nextDouble();
				

					resultado = mat.somar(a,b);
					System.out.println("O resultado e: "+resultado);

				}else if(op == 2){
					System.out.printf("Digite o 1o numero: ");
					a = input.nextDouble();
	

					System.out.printf("Digite o 2o numero: ");
					b = input.nextDouble();


					resultado = mat.subtrair(a,b);
					System.out.println("O resultado e: "+resultado);
				
				}else if( op == 3){
					System.out.printf("Digite o 1o numero: ");
					a = input.nextDouble();

					System.out.printf("Digite o 2o numero: ");
					b = input.nextDouble();
					

					resultado = mat.multiplicar(a,b);
					System.out.println("O resultado e: "+resultado);

				}else if(op == 4){
					System.out.printf("Digite o 1o numero: ");
					a = input.nextDouble();
			

					System.out.printf("Digite o 2o numero: ");
					b = input.nextDouble();


					resultado = mat.dividir(a,b);
					System.out.println("O resultado e: "+resultado);
				}else if(op == 0)break;
				else{
					System.out.printf("Opcao invalida!\n");
				}
				


			}while(op != 0);
		
		}catch(ParamZeroException pam){
			System.out.printf("Os numeros nao podem ser zero!\n");

		}catch(ResultadoZeroException res){
			System.out.printf("O resultado deve ser diferente de zero!\n");

		}
		catch(Exception e){
			System.out.printf("Outro erro!\n");

		}
		
	}
}
