public class Vetor{

	public static int somaVetor(int[] v, int x, int y) throws IntervaloException, VetorVazioException {
		
		int soma = 0;
		
		int a = 0;

		while(x <= y){
			for(int i = 0; i < 5; i++){
				
				if( x < 0 || y > v.length - 1){

					throw new IntervaloException();
				}
				
			}

			soma+=v[x];
			x++;
		}
		int j = 0;
			while(j<v.length){
				if(v[j]== 0){//verifica se alguma posicao do vetor é 0
					a++;
				}
				j++;
			}
	
			if( a == 5){////verifica se todas as posicoes do vetor sao 0

				throw new VetorVazioException();
			}
		return soma;
	}
}