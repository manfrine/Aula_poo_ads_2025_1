package aula4;

public class Aluno {

	private String nome;
	private Double valor;
	private Curso curso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Curso getCurso() {
		return curso;
	}
}
