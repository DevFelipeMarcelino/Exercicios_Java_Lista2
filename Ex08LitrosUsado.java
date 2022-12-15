package lista2;

import java.util.Scanner;

public class Ex08LitrosUsado {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto na viagem:");
		float tempo = sc.nextFloat();
		
		System.out.println("Digite a velocidade média:");
		float velocidade = sc.nextFloat();
		
		float distancia = tempo * velocidade;
		
		float LitrosUsado = distancia / 12;
		
		System.out.println("Concluindo... O tempo gasto foi de:"+tempo+", velocidade de: "+velocidade+" e a quantidade de litros usados foi de: "+LitrosUsado+"Lt");
		
		sc.close();
	}
}
