package lista2;

import java.util.Scanner;

public class Ex05ConvertandoCelsius {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus celsius:");
		float celsius = sc.nextFloat();
		
		float f = (celsius / 5) * 9 + 32;
		
		System.out.println("Convertendo para Fahrenheit ficará: "+f+"°f");
		
		sc.close();
	}
}