package aula5;

public class Alexa extends ProdutoEletronico{

	private String formato;
	
	@Override
	public void ligar() {
		System.out.println("Ligando a Alexa com um comando de voz 'Liga Alexa' ");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando a Alexa com um comando de voz 'Dormir Alexa' ");
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public String getFormato() {
		return formato;
	}
	
}
