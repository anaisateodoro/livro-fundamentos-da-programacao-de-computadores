package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropUmCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float nota1, nota2, nota3, nota4, media;
		String mensagem;

		System.out.println("\nDigite a nota das quatros avaliações:");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		nota4 = entrada.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			mensagem = "Aprovado";
		} else if (media < 7 && media >= 0) {
			mensagem = "Reprovado";
		} else {
			mensagem = "Nota inválida";
		}

		System.out.println("\nMédia: " + casas.format(media));
		System.out.println("Situação: " + mensagem + "\n");
		entrada.close();
	}

}
