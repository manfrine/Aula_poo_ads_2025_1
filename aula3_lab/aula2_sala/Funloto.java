package aula2_sala;

public class Funloto extends Funcionario{

	Double comissao;
	Double vendas;
	
	void calcComissao(){
		if(vendas <= 5000.0)
			comissao = vendas*10/100;
		else
			comissao = vendas*15/100;
	}
	
	void setSalario() {
		super.setSalario();
		salario = salario+comissao;
	}
}
