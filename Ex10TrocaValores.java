package lista2;

import java.util.Scanner;

public class Ex10TrocaValores {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		float a = sc.nextFloat();
		
		System.out.println("Digite o valor de B:");
		float b = sc.nextFloat();
		
		float auxiliar = b;
		b = a;
		
		System.out.println("Trocando os valores ficará... Valor de A: "+auxiliar+ " e o valor de B: "+b);
		
		sc.close();
	}

}
