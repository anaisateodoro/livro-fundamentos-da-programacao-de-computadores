package capituloseisexerciciospropostos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExerPropSeisCapSeis {

	@FunctionalInterface
	interface Validator {
		boolean validate(double value);
	}

	@FunctionalInterface
	interface CommissionCalculator {
		double calculate(double commissionPercentage, double totalSales);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		String[] names = new String[3];
		double[] commissions = new double[3];
		Validator commissionValidator = value -> value > 0 && value < 100;
		Validator salesValidator = value -> value > 0;
		CommissionCalculator commissionCalculator = (commissionPercentage, totalSales) -> {
			return (totalSales * commissionPercentage) / 100;
		};

		for (int i = 0; i < names.length; i++) {
			System.out.print("Digite o nome do " + (i + 1) + "º vendedor: ");
			names[i] = scanner.nextLine();
			double commissionPercentage = getInputValue(scanner, commissionValidator,
					"Digite o percentual de comissão que o(a) vendedor(a) tem direito: ");
			double sales = getInputValue(scanner, salesValidator, "Digite o total das vendas do(a) vendedor(a): R$ ");
			commissions[i] = commissionCalculator.calculate(commissionPercentage, sales);
		}

		for (int i = 0; i < names.length; i++) {
			String formattedCommission = moneyFormat.format(commissions[i]);
			System.out.printf("%s: %s\n", names[i], formattedCommission);
		}
	}

	private static double getInputValue(Scanner scanner, Validator validator, String prompt) {
		double value;
		do {
			System.out.print(prompt);
			value = scanner.nextDouble();
			scanner.nextLine();
		} while (!validator.validate(value));
		return value;
	}
}
