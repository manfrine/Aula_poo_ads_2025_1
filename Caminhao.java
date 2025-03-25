package aula3_lab;

public class Caminhao extends Veiculo {

	Double peso;
	
	void calcIpva() {
		if(peso <=20000.0) {
			ipva = valor*00.1;
		}else if(peso <=30000.0) {
			ipva = valor*00.2;
		}else if(peso <=40000.0) {
			ipva = valor*00.4;
		}else {
			ipva = valor*00.5;
		}
	}
}
