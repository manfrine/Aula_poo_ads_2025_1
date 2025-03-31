package exemplo;

public class TesteCarro {

	public static void main(String[] args) {
		//instancia
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		Carro obj3 = new Carro();
		
		car1.modelo = "Onix";
		car1.marca = "Chevrolet";
		car1.ano = 2020;
		car1.cor = "Preto";
		car1.valor = 50000.0;
		car1.calcIpva();
		
		car2.modelo = "Corolla";
		car2.marca = "Toyota";
		car2.ano = 2023;
		car2.cor = "Prata";
		car2.valor = 110000.0;
		car2.calcIpva();
		
		obj3.modelo = "Celta";
		obj3.marca = "Chevrolet";
		obj3.ano = 2010;
		obj3.cor = "Vermelho";
		obj3.valor = 20000.0;
		obj3.calcIpva();
		
		System.out.println("O modelo: "+car1.modelo);
		System.out.println("A marca: "+car1.marca);
		System.out.println("A cor: "+car1.cor);
		System.out.println("O valor: R$ "+car1.valor);
		System.out.println("O valor do IPVA: R$ "+car1.ipva);
		
		System.out.println("\nO modelo: "+car2.modelo);
		System.out.println("A marca: "+car2.marca);
		System.out.println("A cor: "+car2.cor);
		System.out.println("O valor: R$ "+car2.valor);
		System.out.println("O valor do IPVA: R$ "+car2.ipva);
		
		System.out.println("\nO modelo: "+obj3.modelo);
		System.out.println("A marca: "+obj3.marca);
		System.out.println("A cor: "+obj3.cor);
		System.out.println("O valor: R$ "+obj3.valor);
		System.out.println("O valor do IPVA: R$ "+obj3.ipva);
		
	}
}
