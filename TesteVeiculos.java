package aula3_lab;

import java.util.Scanner;

public class TesteVeiculos {

	public static void main(String[] args) {
		
		Marca m1 = new Marca("Honda");
		Marca m2 = new Marca("Toyota");
		Marca m3 = new Marca("Fiat");
		//Marca m4 = new Marca();
		//m4.nome = "BYD";
		Veiculo vei = new Veiculo();
		Moto m = new Moto();
		Caminhao cam = new Caminhao();
		
		Scanner into  = new Scanner(System.in);
		
		System.out.println("Digite o modelo do veículo");
		vei.modelo = into.next();
		System.out.println("Digite o valor do veículo");
		vei.valor = into.nextDouble();
		System.out.println("Digite o ano do veículo");
		vei.ano = into.nextInt();
		
		System.out.println("\nA marca 1: "+m1.nome);
		System.out.println("A marca 2: "+m2.nome);
		System.out.println("A marca 3: "+m3.nome);
		
		System.out.println("Digite o número da marca correspondente");
		int a = into.nextInt();
		
		if(a==1)
			vei.marca = m1;
		else if(a==2)
			vei.marca = m2;
		else
			vei.marca = m3;
		
		vei.calcIpva();
		
		System.out.println("\nO veículo: "+vei.modelo);
		System.out.println("O ano do veículo: "+vei.ano);
		System.out.println("O valor do veículo: R$ "+vei.valor);
		System.out.println("a marca do veículo: R$ "+vei.marca.nome);
		System.out.println("O valor do IPVA do veículo: R$ "+vei.ipva);

	}

}
