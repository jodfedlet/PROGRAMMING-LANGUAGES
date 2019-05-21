import java.util.*;
public class searchException{

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.printf("\n\nLeia um inteiro: ");
		int in = cin.nextInt();

		
		try{
			int[] vet = new int[in];//criacao do vetor

			vet[in+1] = 123;// tentativa de acessar a uma posicao inexistente
			System.out.printf("Deve ignorar essa linha!\n\n");
		}catch(ArrayIndexOutOfBoundsException array){
			System.out.printf("Nao e permitido acessar a uma posicao inexistente!\n\n");
		
		}


	} 
}