package lista2;

import java.util.Scanner;

public class Ex03SalarioReajuste {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu sal�iro atual");
		float SalarioAtual = sc.nextFloat();
		
		System.out.println("Digite o percentual de reajuste");
		float reajuste = sc.nextFloat();
		
		float SalarioNovo = SalarioAtual + (SalarioAtual / reajuste);
		
		System.out.println("Seu novo sal�rio ser� de: R$"+ SalarioNovo);
		
	}
}
