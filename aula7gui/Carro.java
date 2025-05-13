package aula7gui;

public class Carro {
	
	private String modelo;
	private String marca;
	private Double valor;
	private Double imposto;
	
	Carro(){}

	public Carro(String modelo, String marca, Double valor) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
	}

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

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	void calcImposto() {
		
		if(valor <= 40000.0) {
			imposto = valor*2/100;
		}else if(valor <= 60000.0) {
			imposto = valor*3/100;
		}else {
			imposto = valor*4/100;
		}
	}

}
