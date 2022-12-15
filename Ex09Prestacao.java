package lista2;

import java.util.Scanner;

public class Ex09Prestacao {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor original da prestação:");
		float valor = sc.nextFloat();
		
		System.out.println("Digite a taxa cobrada:");
		float taxa = sc.nextFloat();
		
		System.out.println("Digite o tempo que ficou em atraso:");
		float tempo = sc.nextFloat();
		
		float prestacao = valor +((valor*taxa/100)*tempo);
		
		System.out.println("O valor final da prestação ficou: R$"+prestacao);
		
		sc.close();
	}

}
