package aula4_desafio;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {

		Marca m1 = new Marca("Honda");
		Marca m2 = new Marca("Yamaha");
		Marca m3 = new Marca("BMW");
		Marca m4 = new Marca("Kawazaki");
		
		Moto obj = new Moto();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o modelo da moto: ");
		obj.setModelo(into.next());
		System.out.println("Digite o ano: ");
		obj.setAno(into.nextInt());
		System.out.println("Digite o valor da moto: ");
		obj.setValor(into.nextDouble());
		System.out.println("Digite as cilindradas: ");
		obj.setCilindradas(into.nextInt());
		
		System.out.println("Marca 1 da moto: "+m1.getNome());
		System.out.println("Marca 2 da moto: "+m2.getNome());
		System.out.println("Marca 3 da moto: "+m3.getNome());
		System.out.println("Marca X da moto: "+m4.getNome());
		
		System.out.println("Digite o número da marca da moto: ");
		int a = into.nextInt();
		
		if(a==1)
			obj.setMarca(m1);
		else if(a==2)
			obj.setMarca(m2);
		else if(a==2)
			obj.setMarca(m3);
		else
			obj.setMarca(m4);
		
		obj.calcIpva();
		
		System.out.println("A moto: "+obj.getModelo());
		System.out.println("A moto valor: "+obj.getValor());
		System.out.println("A IPVA: R$ "+obj.getIpva());
		System.out.println("A marca: "+obj.getMarca().getNome());

	}

}
