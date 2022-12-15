package lista2;

import java.util.Scanner;

public class Ex01IdadeDias {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int anos;
		int meses;
		int dias;
		int DiasVida;
		
		System.out.println("Quantos anos você tem?");
		anos = sc.nextInt();
		
		System.out.println("E quantos meses?");
		meses = sc.nextInt();
		
		System.out.println("E quantos dias?");
		dias = sc.nextInt();
		
		DiasVida = (anos * 360) + (meses * 30) + dias;
		
		System.out.println("Ok... Até esse momento você viveu "+DiasVida+" dias.");
		
		sc.close();
	}
	

}
