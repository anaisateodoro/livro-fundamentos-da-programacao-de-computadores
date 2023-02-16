package capitulocinco;

public class ExercicioSeteCapituloCinco {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, soma;

		System.out.print(num1 + " - " + num2);

		// Laço de repetição baseado na quantidade de termos
		for (int i = 3; i <= 8; i++) {
			soma = num1 + num2;
			num1 = num2;
			num2 = soma;

			// Exibir dados
			System.out.print(" - " + soma);
		}

		System.out.println("");

	}

}
