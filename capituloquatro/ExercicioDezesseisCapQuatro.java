package capituloquatro;

import java.util.Scanner;

public class ExercicioDezesseisCapQuatro {

	public static void main(String[] args) {
		double pre, venda, novo_pre = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o preço atual: ");

		pre = entrada.nextDouble();

		System.out.println("Digite a venda mensal: ");
		venda = entrada.nextDouble();
		if (venda < 500 || pre < 30)
			novo_pre = pre + pre * 10 / 100;
		if ((venda >= 500 && venda < 1200) || (pre >= 30 && pre < 80))
			novo_pre = pre + pre * 15 / 100;
		if (venda >= 1200 || pre >= 80)
			novo_pre = pre - pre * 20 / 100;

		System.out.println("Novo preço = " + novo_pre);

	}

}
