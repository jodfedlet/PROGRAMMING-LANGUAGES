
import java.util.*;

public class Empresa{

	String name,CNPJ;
	int i = 0;
  	/*name = "JOAOZIN DA BODEGA";
	CNPJ = "0120012345";*/

	List<Funcionario> bodegueiros = new ArrayList<Funcionario>();
	List<Cliente> client = new ArrayList<Cliente>();
	List<Bebida> beb = new ArrayList<Bebida>();

	public Empresa(){

	}
	public void contrata(Funcionario fun){
		
		bodegueiros.add(fun);
		
		i++;
	}

	public void listaBodegueiros(){

		Iterator<Funcionario> j = bodegueiros.iterator();
		System.out.printf("==============================\n\n");
		System.out.println("Empresa: JOAOZIN DA BODEGA");
		System.out.println(">>>CNPJ: 01200123452534");
		System.out.println("Quantidade de funcionarios : "+i);
		System.out.printf("==============================\n\n");
		while(j.hasNext()){
			
			
			Funcionario fun = j.next();

			System.out.println("Nome: "+fun.nome);
			System.out.println("CPF: "+fun.cpf);
			System.out.println("Endereco: "+fun.endereco);
			System.out.println("Salario: "+fun.salario);
			System.out.println("Data de entrada: "+fun.dia+"/"+fun.mes+"/"+fun.ano);
			System.out.println("Posicao: "+bodegueiros.indexOf(fun));
			System.out.print("\n\n");
		}
		
		System.out.printf("______________________________\n");
	}
	
}
