package aula4;

public class Curso {
	
	private String nome;
	
	Curso(){}
	
	Curso(String nome){
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
