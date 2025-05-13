package aula7gui;

public class Pessoa {

	private String nome;
	private Integer idade;
	private Double renda;
	
	Pessoa(){}

	public Pessoa(String nome, Integer idade, Double renda) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}	
}
