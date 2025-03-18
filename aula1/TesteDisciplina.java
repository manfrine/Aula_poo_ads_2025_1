package aula1;

import java.util.Scanner;

public class TesteDisciplina {

	public static void main(String[] args) {
		
		Disciplina obj1 = new Disciplina();
		Disciplina obj2 = new Disciplina();
		Aluno a1 = new Aluno();
		int a = 0;
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o nome da disciplina 1: ");
		obj1.nome = into.next();
		System.out.println("Digite a ementa da disciplina: ");
		obj1.ementa = into.next();
		System.out.println("Digite o semestre da disciplina: ");
		obj1.semestre = into.next();
		System.out.println("Digite a carga horaria da disciplina: ");
		obj1.cargaHoraria = into.nextInt();
		obj1.setValor();
		
		System.out.println("Digite o nome da disciplina 2: ");
		obj2.nome = into.next();
		System.out.println("Digite a ementa da disciplina: ");
		obj2.ementa = into.next();
		System.out.println("Digite o semestre da disciplina: ");
		obj2.semestre = into.next();
		System.out.println("Digite a carga horaria da disciplina: ");
		obj2.cargaHoraria = into.nextInt();
		obj2.setValor();
		
		System.out.println("A disciplina: "+obj1.nome);
		System.out.println("A ementa: "+obj1.ementa);
		System.out.println("O valor: R$ "+obj1.valor);
		System.out.println("\n---------------------\n");
		System.out.println("\nA disciplina: "+obj2.nome);
		System.out.println("A ementa: "+obj2.ementa);
		System.out.println("O valor: R$ "+obj2.valor);
		
		System.out.println("\n\n ***   Digite o nome do aluno: ***");
		a1.nome = into.next();
		System.out.println("Digite a n1: ");
		a1.n1 = into.nextDouble();
		System.out.println("Digite a n2: ");
		a1.n2 = into.nextDouble();
		System.out.println("Digite a n3: ");
		a1.n3 = into.nextDouble();
		a1.calcMedia();
		
		System.out.println("Digite 1 p/ matricula-lo da disciplina 1 ou 2 p/ a outra: ");
		a = into.nextInt();
		
		if(a==1)
			a1.disc = obj1;
		else
			a1.disc = obj2;
		
		System.out.println("O nome do aluno: "+a1.nome);
		System.out.println("a media: "+a1.media);
		System.out.println("O status: "+a1.status);
		System.out.println("A disciplina do aluno: "+a1.disc.nome);
	}

}
