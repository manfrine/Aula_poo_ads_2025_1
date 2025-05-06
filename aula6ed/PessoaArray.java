package aula6ed;

import java.util.ArrayList;

public class PessoaArray {
	
	Pessoa pes;
	ArrayList<Pessoa> vet = new ArrayList<Pessoa>();
	
	void salvar(Pessoa p) {
		vet.add(p);
	}
	
	void listar() {
		for(Pessoa p: vet) {
			System.out.println("\nO nome: "+p.getNome()
					 		   +"\nA idade: "+p.getIdade()
					 		   +"\nO salário: R$ "+p.getSalario());
		}
	}
	
	void excluir(int cod) {
		cod= cod-1;
		vet.remove(cod);
	}
	
	Pessoa buscar(int cod) {
		cod--;
		return vet.get(cod);
	}
	
	void alterar(int cod, Pessoa pes) {
		cod--;
		vet.set(cod, pes);
	}
}
