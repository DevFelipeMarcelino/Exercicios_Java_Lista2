package lista2;

import java.util.Scanner;

public class Ex06ConvertendoFahrenheit {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit:");
		float f = sc.nextFloat();
		
		float celsius = (f - 32) * 5 / 9;
		
		System.out.println("Convertendo para Fahrenheit celsius: "+celsius+"°C");
		
		sc.close();
	}

}