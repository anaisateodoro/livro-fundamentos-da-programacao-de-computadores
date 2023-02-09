package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropCincoCapTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		double preco, desconto, precoNovo;

		System.out.print("Digite o preço do produto: ");
		preco = entrada.nextDouble();

		desconto = preco * 0.1F;
		precoNovo = preco - desconto;

		System.out.println("Desconto de 10%: R$" + casas.format(desconto));
		System.out.println("Preço novo com desconto: R$" + casas.format(precoNovo));

		entrada.close();

	}

}
