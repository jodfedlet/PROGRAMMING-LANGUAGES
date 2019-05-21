import java.util.*;

public class Teste2{

	public static void main(String[] args) {// classe principal
		Scanner input = new Scanner(System.in);
		Vetor V = new Vetor();
		int[] vet = new int[5];
		int j, sum;
		
		try{
			System.out.printf("\nLeia o vetor\n");
			for(j = 0; j < 5; j++){
				System.out.printf("\nposicao %d: ",j);
				vet[j] = input.nextInt();

			}
			System.out.println("leia o intervalo: (ex: 1 a 12)");
			System.out.printf("Inicio: ");
			int en1 = input.nextInt();

			System.out.printf("Fim: ");
			int en2 = input.nextInt();

			sum = Vetor.somaVetor(vet,en1,en2);
			System.out.println("Soma: "+sum);

		}catch(IntervaloException inter){
			System.out.printf("Intervalo invalido!\n");
		
		}catch(VetorVazioException veto){
			System.out.printf("Vetor vazio!\n");
	
		}catch(Exception e){
			System.out.printf("Outro erro!\n");
		}
	}
}