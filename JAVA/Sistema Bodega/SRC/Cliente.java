
public class Cliente{
	String nome,cpf;
	boolean fiado;
	int posCl;

	public Cliente(String nom, String CpfClente, boolean fiad,int posiCl){
		nome = nom;
		cpf = CpfClente;
		fiado = fiad;
		posCl = posiCl;
	}

	public void mostrarCliente(){
        
        System.out.println("Cliente "+this.posCl);
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		if(this.fiado){
			System.out.println("Pode vender fiado");
		}
        else{
            System.out.println("Nao pode vender fiado");
        }
	}

}
