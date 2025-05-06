package aula6ed;

public class PessoaVetor {
	
	Pessoa[] vetor;
	int cont=0;
	
	void criarLista() {
		vetor = new Pessoa[5];
	}
	
	void inserir(Pessoa pessoa) {
		if(cont == 5) {
			System.out.println("Lista Cheia !!");
		}else {
			vetor[cont] = new Pessoa();
			vetor[cont].setNome(pessoa.getNome());
			vetor[cont].setIdade(pessoa.getIdade());
			vetor[cont].setSalario(pessoa.getSalario());
			cont++;
			System.out.println("Objeto cadastrado com Sucesso !!");
		}
	}
	
	void listar() {
		if(cont == 0) {
			System.out.println("Lista está Vazia !!");
		}else {
			for(int i=0; i<cont;i++) {
				System.out.println("O nome: "+vetor[i].getNome()
								  +"\nA idade: "+vetor[i].getIdade()
								  +"\nO salario: R$ "+vetor[i].getSalario()
								  +"\n----------------------------------");
			}
		}
	}

}
