package lista2;

import java.util.Scanner;

public class Ex04CustoCarro {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica:");
		float CustoFabrica = sc.nextFloat();
		
		float distribuidor = CustoFabrica * 0.28f;
		float imposto = CustoFabrica * 0.45f;
		
		float CustoFinal = CustoFabrica + distribuidor + imposto;
		
		System.out.println("O custo final do carro ficará: R$"+CustoFinal);
		
		sc.close();
	}

}
