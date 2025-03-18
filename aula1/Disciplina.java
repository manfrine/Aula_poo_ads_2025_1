package aula1;

public class Disciplina {

	String nome;
	String ementa;
	String semestre;
	Integer cargaHoraria;
	Double valor;
	
	void setValor() {
		if(cargaHoraria <= 60)
			valor = 500.0;
		else
			valor = 700.0;
	}
}
