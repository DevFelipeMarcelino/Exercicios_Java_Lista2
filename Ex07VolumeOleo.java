package lista2;

import java.util.Scanner;

public class Ex07VolumeOleo {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura da lata:");
		float altura = sc.nextFloat();
		
		System.out.println("Digite o raio da lata:");
		float raio = sc.nextFloat();
		
		float pi = 3.14f;
		
		float volume = pi * (raio * raio) * altura;
		
		System.out.println("O volume será de: "+volume);
		
		sc.close();
}
}
