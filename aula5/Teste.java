package aula5;

public class Teste {

	public static void main(String[] args) {
		
		TV obj = new TV();
		Alexa obj2 = new Alexa();
		
		obj.setModelo("S-5050");
		obj.setMarca("SAMSUNG");
		obj.setValor(3000.0);
		obj.setQtdCanais(20);
		
		obj.ligar();
		System.out.println("Modelo: "+obj.getModelo());
		obj.play();
		obj.pause();
		obj.stop();
		obj.desligar();
		
	}

}
