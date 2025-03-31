package exemplo;

public class Carro {

	// atributos
	String modelo;
	String marca;
	Integer ano;
	String cor;
	Double valor;
	Double ipva;
	
	void calcIpva() {
		if(valor <= 40000.0) {
			ipva = valor*2/100;
		}else if(valor <= 60000.0) {
			ipva = valor*4/100;
		}else if(valor <= 80000.0) {
			ipva = valor*0.06;
		}else {
			ipva = valor*0.07;
		}
	}//fim do metodo
}//fim da classe
