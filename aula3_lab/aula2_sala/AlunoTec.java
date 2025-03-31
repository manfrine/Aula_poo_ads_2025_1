package aula2_sala;

public class AlunoTec {

	String nome;
	Double n1;
	Double n2;
	Double media;
	String status;
	Integer ano;
	
	void calcMedia() {
		media = (n1+n2)/2;
		if(media >= 5)
			status = "Aprovado";
		else
			status = "Reprovado";
	}
}
