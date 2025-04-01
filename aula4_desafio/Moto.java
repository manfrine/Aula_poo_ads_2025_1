package aula4_desafio;

public class Moto extends Veiculo{

	private Integer cilindradas;
	
	public void calcIpva() {
		if(getMarca().getNome().equals("Honda")) {
			setIpva(getValor()*2/100);
		}else if(getMarca().getNome().equals("Yamaha")) {
			setIpva(getValor()*3/100);
		}else if(getMarca().getNome().equals("BMW")) {
			setIpva(getValor()*4/100);
		}else {
			setIpva(getValor()*6/100);
		}
		
	}
	
	
	public Integer getCilindradas() {
		return cilindradas;
	}
	
	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
}
