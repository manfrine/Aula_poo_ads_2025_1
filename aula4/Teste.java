package aula4;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Curso c1 = new Curso("ADS");
		Curso c2 = new Curso("ENG SW");
		Curso c3 = new Curso("DIREITO");
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o nome do Aluno: ");
		a1.setNome(into.next());
		
		System.out.println("Digite o valor da mensalidade: ");
		a1.setValor(into.nextDouble());
		
		System.out.println("O curso 1: "+c1.getNome());
		System.out.println("O curso 2: "+c2.getNome());
		System.out.println("O curso 3: "+c3.getNome());
		
		System.out.println("Digite o no. do curso correspondente para a matricula: ");
		int a = into.nextInt();
		
		if(a==1)
			a1.setCurso(c1);
		else if(a==2)
			a1.setCurso(c2);
		else
			a1.setCurso(c3);
		
		System.out.println("O Aluno: "+a1.getNome());
		System.out.println("O curso do aluno: "+a1.getCurso().getNome());
		System.out.println("O valor: R$ "+a1.getValor());
		
	}
}
