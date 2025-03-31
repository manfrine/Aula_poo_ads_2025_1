package aula3_lab;

public class AlunoPos extends AlunoFacul{

	Double n4;
	Integer tcc = 0;
	
	void calcMedia() {
		media = (n1+n2+n3+n4)/4;
		if(media >=5)
			status = "Aprovado";
		else
			status = "Reprovado";
	}
	
	void calcMedia(Integer a) {
		media = 10.0;
		if(media == 10)
			status = "Aprovado";
		else
			status = "Reprovado";
	}
}
