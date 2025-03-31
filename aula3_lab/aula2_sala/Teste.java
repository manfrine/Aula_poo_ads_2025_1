package aula2_sala;

public class Teste {

	public static void main(String[] args) {
		
		AlunoTec at = new AlunoTec();
		AlunoFacul af = new AlunoFacul();
		
		at.nome = "João";
		at.n1 = 4.0;
		at.n2 = 7.0;
		at.ano = 2023;
		at.calcMedia();
		
		af.nome = "José";
		af.n1 = 4.0;
		af.n2 = 0.0;
		af.n3 = 6.0;
		af.ano = 2025;
		af.calcMedia();

		System.out.println("Nome técnico: "+at.nome);
		System.out.println("A média: "+at.media);
		System.out.println("O status: "+at.status);
		System.out.println("O ano: "+at.ano);
		
		System.out.println("\nNome faculdade: "+af.nome);
		System.out.println("A média: "+af.media);
		System.out.println("O status: "+af.status);
		System.out.println("O ano: "+af.ano);
		
	}

}
