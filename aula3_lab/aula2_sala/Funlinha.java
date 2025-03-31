package aula2_sala;

public class Funlinha extends Funcionario{
	
	Double bonus;
	
	void setBonus() {
		bonus = 0.20;
	}
	
	void setSalario(){
		salario = salario + salario*bonus;
	}

}
