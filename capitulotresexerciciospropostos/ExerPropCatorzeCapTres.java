package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropCatorzeCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int anoNasc, anoAtual, idadeAnos;
		float idadeMes, idadeDias, idadeSem;

		System.out.print("Digite o ano de nascimento: ");
		anoNasc = entrada.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = entrada.nextInt();

		idadeAnos = anoAtual - anoNasc;
		idadeMes = idadeAnos * 12;
		//idadeSem = idadeMes 
		//idadeDias = idadeSem * 7;

		System.out.println("Idade em anos: " + idadeAnos);
		System.out.println("Idade em meses: " + idadeMes);
		//System.out.println("Idade em semanas: " + idadeSem);
		//System.out.println("Idade em dias: " + idadeDias);

	}

}
