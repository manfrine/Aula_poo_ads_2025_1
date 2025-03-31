package aula3_lab;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		AlunoTec at = new AlunoTec();
		AlunoFacul af = new AlunoFacul();
		AlunoPos ap = new AlunoPos();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		at.nome = into.next();
		System.out.println("Digite a n1: ");
		at.n1 = into.nextDouble();
		System.out.println("Digite a n2: ");
		at.n2 = into.nextDouble();
		at.calcMedia();
		System.out.println("\n------------------\n");
		System.out.println("Digite o nome do aluno facul: ");
		af.nome = into.next();
		System.out.println("Digite a n1: ");
		af.n1 = into.nextDouble();
		System.out.println("Digite a n2: ");
		af.n2 = into.nextDouble();
		System.out.println("Digite a n3: ");
		af.n3 = into.nextDouble();
		af.calcMedia();
		System.out.println("\n------------------\n");
		
		System.out.println("Digite o nome do aluno pós: ");
		ap.nome = into.next();
		System.out.println("Digite a n1: ");
		ap.n1 = into.nextDouble();
		System.out.println("Digite a n2: ");
		ap.n2 = into.nextDouble();
		System.out.println("Digite a n3: ");
		ap.n3 = into.nextDouble();
		System.out.println("Digite a n4: ");
		ap.n4 = into.nextDouble();
		System.out.println("Digite 1 p/ calcular a media pelo TCC ou 2 pelas notas:  ");
		int a = into.nextInt();
		if(a==1)
			ap.calcMedia(a);
		else
			ap.calcMedia();
		System.out.println("\n------------------\n");
		
		System.out.println("O nome do aluno do curso técnico: "+at.nome);
		System.out.println("A média do aluno do curso técnico: "+at.media);
		System.out.println("O status do aluno do curso técnico: "+at.status);
		
		System.out.println("\nO nome do aluno do curso superior: "+af.nome);
		System.out.println("A média do aluno do curso superior: "+af.media);
		System.out.println("O status do aluno do curso superior: "+af.status);
		
		System.out.println("\nO nome do aluno do curso pós: "+ap.nome);
		System.out.println("A média do aluno do curso pós: "+ap.media);
		System.out.println("O status do aluno do curso pós: "+ap.status);
	}
}
