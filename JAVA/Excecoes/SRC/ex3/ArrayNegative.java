
import java.util.*;
public class ArrayNegative{

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.printf("\n\nLeia um inteiro negativo(ex: -4): ");
		int in = cin.nextInt();

		
		try{
			int[] vet = new int[in];//criacao do vetor
			System.out.printf("Deve ignorar essa linha!\n\n");
		}catch(NegativeArraySizeException neg){
			System.out.printf("Nao e permitido acessar a uma posicao negativa de um vetor!\n\n");
		}


	} 
}