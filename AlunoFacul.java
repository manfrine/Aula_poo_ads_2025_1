package aula3_lab;

public class AlunoFacul extends AlunoTec{
	Double n3;
	
	void calcMedia() {
		media = (n1+n2+n3)/3;
		if(media >=6)
			status = "Aprovado";
		else if(media < 6 && media >=4)
			status = "em exame";
		else
			status = "Reprovado";
	}

}
