package aula5;

public abstract class ProdutoEletronico {

	private String modelo;
	private String marca;
	private Double valor;
	
	public abstract void ligar();
	
	public abstract void desligar();
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
