package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropDoisCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float nota1, nota2, media;
		String mensagem;

		System.out.println("\nDigite a nota das duas avaliações:");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();

		media = (nota1 + nota2) / 2;

		if (media >= 0 && media < 3) {
			mensagem = "Reprovado";
		} else if (media >= 3 && media < 7) {
			mensagem = "Exame";
		} else if (media >= 7 && media <= 10) {
			mensagem = "Aprovado";
		} else {
			mensagem = "Nota inválida";
		}

		System.out.println("\nMédia: " + casas.format(media));
		System.out.println("Situação: " + mensagem + "\n");

	}

}
