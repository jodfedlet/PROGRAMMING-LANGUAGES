import javax.swing.JOptionPane;

public class Medicamento{
	String nome;
	double precoVenda;
	Data dataValidade = new Data();
	Laboratorio laboratorio = new Laboratorio();
	boolean receitaObrigatoria;
	int qtdEstoque;


	public void vender( boolean receita){
		if(receita){
			JOptionPane.showMessageDialog(null,"Medicamento validado com Sucesso!");
			
				
		}
	}
	
	public void reajustarPreco(double p){
		if( p > 0){
			this.precoVenda+= p/100 * this.precoVenda;
			JOptionPane.showMessageDialog(null,"Preco aumentou! Aperte Ok para continuar");
		}
		else if(p < 0){
			this.precoVenda+= p/100 * this.precoVenda;
			JOptionPane.showMessageDialog(null,"Preco diminuiu! Aperte Ok para continuar");
		}
		else{
			this.precoVenda = this.precoVenda;
		}

	}

	public void mostra(){
	
		System.out.println("========================================================");
		System.out.println("** NOME: "+this.nome);
		System.out.println("** PRECO DE VENDA: "+this.precoVenda);
		System.out.println("** VALIDADE: "+this.dataValidade.format());
		System.out.printf("** LABORATORIO\n");
		System.out.println("		Nome: "+this.laboratorio.nome);
		System.out.println("		Razao Social: "+this.laboratorio.razaoSocial);
		System.out.println("		CNPJ: "+this.laboratorio.cnpj);
		System.out.println("		Inscricao Estadual: "+this.laboratorio.inscricaoEstadual);
		System.out.println("		Endereco: "+this.laboratorio.endereco);
		System.out.println("		Telefone: "+this.laboratorio.telefone);
		System.out.println("** RECEITA: "+this.receitaObrigatoria);
		System.out.println("** QUANTIDADE: "+this.qtdEstoque);
		System.out.println("========================================================");
	}

}
