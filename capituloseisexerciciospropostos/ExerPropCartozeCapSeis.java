package capituloseisexerciciospropostos;

import java.util.Scanner;

public class ExerPropCartozeCapSeis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[6];
		double[] grades1 = new double[6];
		double[] grades2 = new double[6];
		double classAverage, passPercent, examPercent, failPercent;
		int passCount = 0, examCount = 0, failCount = 0;
		double sumGrades = 0;

		for (int i = 0; i < 6; i++) {
			System.out.print("Digite o nome do estudante " + (i + 1) + ": ");
			names[i] = input.nextLine();
			System.out.print("Digite a nota " + names[i] + " do primeiro teste: ");
			grades1[i] = input.nextDouble();
			System.out.print("Digite a nota " + names[i] + " do segundo teste: ");
			grades2[i] = input.nextDouble();
			input.nextLine();

			double average = (grades1[i] + grades2[i]) / 2;
			sumGrades += average;

			System.out.print(names[i] + " " + grades1[i] + " " + grades2[i] + " ");
			System.out.printf("%.1f", average);

			if (average >= 6.0) {
				System.out.println(" Aprovado");
				passCount++;
			} else {
				System.out.println(" Reprovado");
				failCount++;
			}
		}

		classAverage = sumGrades / 6;
		passPercent = (passCount / 6.0) * 100.0;
		examCount = passCount + failCount;
		examPercent = (examCount / 6.0) * 100.0;
		failPercent = (failCount / 6.0) * 100.0;

		System.out.println("Media classe = " + classAverage);
		System.out.printf("Percentual de alunos aprovados = %.2f%%\n", passPercent);
		System.out.printf("Percentual de alunos de exames  = %.2f%%\n", examPercent);
		System.out.printf("Percentual de alunos reprovados  = %.2f%%\n", failPercent);
	}

}
