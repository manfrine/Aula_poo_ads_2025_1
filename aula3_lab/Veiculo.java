package aula3_lab;

public class Veiculo {

	String modelo;
	Integer ano;
	Double valor;
	Double ipva;
	Marca marca;
	
	void calcIpva() {
		if(marca.equals("Fiat")) {
			ipva = valor*2/100;
		}else if(marca.equals("Honda")) {
			ipva = valor*3/100;
		}else if(marca.equals("Toyota")) {
			ipva = valor*4/100;
		}else {
			ipva = valor*6/100;
		}
	}
}
