package aula2_sala;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario fun = new Funcionario();
		Funcel fc = new Funcel();
		Funlinha fl = new Funlinha();
		Funloto flo = new Funloto();
		Funmoveis fm = new Funmoveis();
		
		flo.nome = "João";
		flo.cpf = "1234546";
		flo.rg = "33445566";
		flo.setor = "Loterias";
		flo.vendas = 10000.0;
		
		flo.calcComissao();
		flo.setSalario();
		
		fm.nome = "José";
		fm.cpf = "1555546";
		fm.rg = "33445566";
		fm.setor = "Móveis";
		fm.folgas = 3;
		fm.setSalario();
		
		System.out.println("O nome: "+flo.nome);
		System.out.println("O nome do setor: "+flo.setor);
		System.out.println("Total de Vendas: R$ "+flo.vendas);
		System.out.println("Total comissão sobre as Vendas: R$ "+flo.comissao);
		System.out.println("Salario: R$ "+flo.salario);
		
		System.out.println("\nO nome: "+fm.nome);
		System.out.println("O nome do setor: "+fm.setor);
		System.out.println("Salario: R$ "+fm.salario);
		System.out.println("A qtd de folgas: "+fm.folgas);
	}

}
