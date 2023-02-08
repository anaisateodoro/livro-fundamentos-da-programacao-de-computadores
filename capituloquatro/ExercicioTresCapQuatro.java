package capituloquatro;

import java.util.Scanner;

public class ExercicioTresCapQuatro {

	public static void main(String[] args) {
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo número");
		num2 = entrada.nextInt();
		// Determinar o número maior
		if (num1 > num2)
			System.out.println("O maior número é: " + num1);
		else if (num2 > num1)
			System.out.println("O maior número é: " + num2);
		else
			System.out.println("Os números são iguais ");

	}

}
