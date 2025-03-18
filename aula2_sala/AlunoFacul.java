package aula2_sala;

public class AlunoFacul extends AlunoTec {

	Double n3;
	
	void calcMedia() {
		media = (n1+n2+n3)/3;
		
		if(media >= 6.0)
			status = "Aprovado";
		else if(media >=4 && media <6.0)
			status = "Em exame";
		else
			status = "Reprovado";
	}
}
