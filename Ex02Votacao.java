package lista2;

import java.util.Scanner;

public class Ex02Votacao {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		float TotalEleitores;
		float VotosNulos;
		float VotosBrancos;
		float VotosValidos;
		
		float PorcentagemNulos;
		float PorcentagemBrancos;
		float PorcentagemValidos;
		
		
		System.out.println("Qual foi o total de eleitores?");
		TotalEleitores = sc.nextFloat();
		
		System.out.println("E qual foi o total de votos nulos?");
		VotosNulos = sc.nextFloat();
		
		System.out.println("E qual foi o total de votos brancos?");
		VotosBrancos = sc.nextFloat();
		
		VotosValidos = TotalEleitores - (VotosBrancos + VotosNulos);
		
		PorcentagemNulos = (VotosNulos / TotalEleitores) * 100;
		PorcentagemBrancos = (VotosBrancos / TotalEleitores) * 100;
		PorcentagemValidos = (VotosValidos / TotalEleitores) * 100;
		
		System.out.println("Ok... O percentual de votos nulos foi de: "+PorcentagemNulos+"%");
		System.out.println("E... O percentual de votos brancos foi de: "+PorcentagemBrancos+"%");
		System.out.println("E... O percentual de votos validos foi de: "+PorcentagemValidos+"%");
		
		sc.close();
	}

}
