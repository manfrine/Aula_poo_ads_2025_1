package aula6ed;

import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {

		Pessoa pessoa;
		PessoaArray pa = new PessoaArray();
		String n= "";
		int id = 0, a=0, b=0, c=0;
		Double sal = 0.0;
		
		Scanner into = new Scanner(System.in);
		
		do {
			
			System.out.println("\n###MENU###");
			System.out.println("\n1 - CADASTRAR");
			System.out.println("2 - LISTAR");
			System.out.println("3 - PESQUISAR");
			System.out.println("4 - ALTERAR");
			System.out.println("5 - EXCLUIR");
	
			System.out.println("\nESCOLHA UMA OPÇÃO: ");
			b = into.nextInt();
			switch (b) {
			case 1: 
				System.out.println("\nMÉTODO CADASTRAR");
				System.out.println("\nDIGITE O NOME");
				n = into.next();
				System.out.println("\nDIGITE A IDADE");
				id = into.nextInt();
				System.out.println("\nDIGITE O SALARIO");
				sal = into.nextDouble();
				pessoa = new Pessoa(n, id, sal);
				pa.salvar(pessoa);
				System.out.println("\nPESSOA SALVA COM SUCESSO !!");
				break;
			case 2:
				System.out.println("\nMÉTODO LISTAR");
				pa.listar();
				break;
			case 3:
				System.out.println("\nMÉTODO BUSCAR");
				System.out.println("\nDIGITE O CÓDIGO P/ REALIZAR A BUSCA: ");
				c = into.nextInt();
				pessoa = new Pessoa();
				pessoa = pa.buscar(c);
				System.out.println("\nENCONTREI");
				System.out.println("\nO NOME:  "+pessoa.getNome());
				System.out.println("\nA IDADE:  "+pessoa.getIdade());
				break;
			case 4:
				System.out.println("\nMÉTODO EXCLUIR");
				System.out.println("\nDIGITE O CÓDIGO P/ REALIZAR A BUSCA: ");
				c = into.nextInt();
				
				pa.excluir(c);
				System.out.println("\nPESSOA EXCLUÍDA");
				
				break;
				
			}
			
			
			System.out.println("\nDigite 1 p/ continuar ou 0 p/ sair: ");
			a = into.nextInt();
		}while(a !=0);
	}

}
