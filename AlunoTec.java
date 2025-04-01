package aula3_lab;

public class AlunoTec {

	String nome;
	String status;
	Double n1;
	Double n2;
	Double media;
	
	void calcMedia() {
		media = (n1+n2)/2;
		if(media >=5)
			status = "Aprovado";
		else
			status = "Reprovado";
	}
}
