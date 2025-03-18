package aula1;

public class Teste {

	public static void main(String[]  agrs) {
		//instancias == objetos
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno aluno = new Aluno();
		Aluno aluno1 = new Aluno();
		
		a1.nome = "João";
		a1.n1 = 7.0;
		a1.n2 = 6.0;
		a1.n3 = 5.0;
		a1.calcMedia(); //mensagem
		
		a2.nome = "José";
		a2.n1 = 5.0;
		a2.n2 = 6.0;
		a2.n3 = 5.0;
		a2.calcMedia();
		
		aluno.nome = "Maria";
		aluno.n1 = 5.0;
		aluno.n2 = 4.0;
		aluno.n3 = 3.0;
		aluno.calcMedia();
		
		System.out.println("O nome do aluno: "+a1.nome);
		System.out.println("a media: "+a1.media);
		System.out.println("O status: "+a1.status);
		
		System.out.println("\nO nome do aluno: "+a2.nome);
		System.out.println("a media: "+a2.media);
		System.out.println("O status: "+a2.status);
		
		System.out.println("\nO nome do aluno: "+aluno.nome);
		System.out.println("a media: "+aluno.media);
		System.out.println("O status: "+aluno.status);
		
		
		
	}
}
