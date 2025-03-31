package aula4;

public class Teste {

	public static void main(String[] args) {
		
		Curso c1 = new Curso("ADS");
		Curso c2 = new Curso("ENG SW");
		Curso c3 = new Curso("DIREITO");
		
		//c1.setNome("ADS");
		
		System.out.println("O curso 1: "+c1.getNome());
		System.out.println("O curso 2: "+c2.getNome());
		System.out.println("O curso 3: "+c3.getNome());
	}
}
