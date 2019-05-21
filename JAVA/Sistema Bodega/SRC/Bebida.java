
 public class Bebida{

	String nome;
	int teorAlc,quantMl, quantEstoque;
	double precVenda;
	int cod;
	
	public Bebida(String nome, int teorAlc, int quantMl, int quantEstoque, double precVenda,int cod){

		this.nome = nome;
		this.teorAlc = teorAlc;
		this.quantMl = quantMl;
		this.quantEstoque = quantEstoque;
		this.precVenda = precVenda;
		this.cod = cod;
	}

	public void compra(int q){

			this.quantEstoque += q;
			System.out.println("____________________________\n\n"+
								"Compra realizada com sucesso!\n\n"+
								"____________________________\n\n");

	}
	public void vender(int qt){
	
			if(qt <= this.quantEstoque){
				this.quantEstoque -= qt;
				System.out.println("____________________________\n\n"+
									"Venda realizada com sucesso!\n\n"+
									"____________________________\n\n");
			}
			else{
				System.out.println("____________________________\n\n"+
									"Quantidade ultrapassou!\n\n"+
									"____________________________\n\n");
			}
		
	}
	public boolean confereEstoque(){
		if(this.quantEstoque > 0){
			return true;

		}
		else{
			return false;		
		}


	}
	public void mostraBebida(){
		System.out.println("________________________________________\n");
		System.out.println("Codigo: "+this.cod);
		System.out.println("Nome: "+this.nome);
		System.out.println("Teor alcoolico: "+this.teorAlc);
		System.out.println("Quantidade(ml): "+this.quantMl);
		System.out.println("Quantidade no estoque: "+this.quantEstoque);
		System.out.println("Preco de venda: "+this.precVenda);

	}
	boolean verificaCompra(int kt){

		if(this.cod == kt){
			return true;
		}
		return false;
	}
	boolean verificaVenda(int k){

		if(this.cod == k){
			return true;
		}
		return false;
	}


}
