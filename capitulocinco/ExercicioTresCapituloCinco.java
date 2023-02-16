package capitulocinco;

import java.util.Scanner;

public class ExercicioTresCapituloCinco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, num, i, j, fat;
		System.out.print("Digite a quantidade de números que serao lidos: ");
		n = entrada.nextInt();
		for (i = 1; i <= n; i++) {
			System.out.println("\nDigite o " + i + "º número ");
			num = entrada.nextInt();
			fat = 1;
			for (j = 1; j <= num; j++)
				fat = fat * j;
			System.out.println("Fatorial de " + num + " = " + fat);

		}
	}
}
