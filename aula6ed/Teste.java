package aula6ed;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pes;
		PessoaVetor pv = new PessoaVetor();
		int a=0, b=0;
		
		Scanner into = new Scanner(System.in);
		pv.criarLista();
		do {
			System.out.println("\n###MENU###");
			System.out.println("\n1 - CADASTRAR");
			System.out.println("\n2 - LISTAR");
			System.out.println("\nESCOLHA UMA OPÇÃO: ");
			b = into.nextInt();
			switch (b) {
			case 1: 
				System.out.println("\nMÉTODO CADASTRAR");
				System.out.println("\nDIGITE O NOME");
				String n = into.next();
				System.out.println("\nDIGITE A IDADE");
				Integer id = into.nextInt();
				System.out.println("\nDIGITE O SALARIO");
				Double s = into.nextDouble();
				pes = new Pessoa(n, id, s);
				pv.inserir(pes);
				
				break;
			case 2: 
				System.out.println("\nMÉTODO LISTAR");
				pv.listar();
				break;
			
			default:
				System.out.println("\nNão está pronto !!!: ");
			}
			
			System.out.println("\nDigite 1 p/ continuar ou 0 p/ sair: ");
			a = into.nextInt();
			
		}while(a!=0);

	}
}
