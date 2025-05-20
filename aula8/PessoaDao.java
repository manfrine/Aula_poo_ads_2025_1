package aula8;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PessoaDao {

	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	Pessoa pes;
	
	void salvar(Pessoa p) {
		lista.add(p);
	}
	
	void listar() {
		for(Pessoa p: lista) {
			JOptionPane.showMessageDialog(null, ""
					+ "O nome: "+p.getNome()
					+"\nA idade: "+p.getIdade()
					+"\nA renda: R$ "+p.getRenda());
		}
	}
	
	Pessoa pesquisar(int cod){
		cod--;
		pes = lista.get(cod);
		return pes;
	}
	
	void alterar(int cod, Pessoa p) {
		cod--;
		lista.set(cod, p);
	}
	
	void excluir(int cod) {
		cod--;
		lista.remove(cod);
	}
}
