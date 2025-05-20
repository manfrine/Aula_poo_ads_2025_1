package aula8;

public class Carro {

	private String modelo;
	private Double  valor;
	private Double imposto;
	
	void calcImposto() {
		if(valor <= 40000.0)
			imposto = valor*2/100;
		else if(valor <= 60000.0)
			imposto = valor*3/100;
		else
			imposto = valor*4/100;
	}
	
	Carro(){}
	
	Carro(String modelo, Double valor){
		super();
		this.modelo = modelo;
		this.valor = valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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
	
	
}



