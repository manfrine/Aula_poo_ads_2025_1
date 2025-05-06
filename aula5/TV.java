package aula5;

public class TV extends ProdutoEletronico implements Player{

	private int qtdCanais;
	
	@Override
	public void ligar() {
		System.out.println("Ligando a TV com um controle remoto");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando a TV com um controle remoto");
	}
	
	public int getQtdCanais() {
		return qtdCanais;
	}
	
	public void setQtdCanais(int qtdCanais) {
		this.qtdCanais = qtdCanais;
	}

	@Override
	public void play() {
		System.out.println("TOCANDO UMA MUSICA NA TV !");
	}

	@Override
	public void stop() {
		System.out.println("DESLIGANDO UMA MUSICA NA TV !");		
	}

	@Override
	public void pause() {
		System.out.println("PARANDO UMA MUSICA NA TV !");
	}
}
