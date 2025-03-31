package aula1;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		aluno.nome = into.next(); // o metodo next captura Strings
		
		System.out.println("Digite a n1: ");
		aluno.n1 = into.nextDouble();//o metodo mextDouble captura Dados Double
		System.out.println("Digite a n2: ");
		aluno.n2 = into.nextDouble();
		System.out.println("Digite a n3: ");
		aluno.n3 = into.nextDouble();
		aluno.calcMedia();
		
		System.out.println("\nO nome do aluno: "+aluno.nome);
		System.out.println("a media: "+aluno.media);
		System.out.println("O status: "+aluno.status);
		
		
	}
}
