package capituloquatro;

import java.util.Scanner;

public class ExercicioDozeCapQuatro {

	public static void main(String[] args) {
		double salario, aumento, novo_sal;
		int cargo;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o cargo do funcionário (1,2,3,4 ou 5)");

		cargo = entrada.nextInt();

		System.out.println("Digite o valor do salário");

		salario = entrada.nextFloat();

		if (cargo == 1) {
			System.out.println("O cargo é Escriturário");
			aumento = salario * 50 / 100;
			System.out.println("O valor do aumento é: " + aumento);
			novo_sal = salario + aumento;
			System.out.println("O novo salário é: " + novo_sal);
		} else if (cargo == 2) {
			System.out.println("O cargo é Secretário");
			aumento = salario * 35 / 100;
			System.out.println("O valor do aumento é: " + aumento);
			novo_sal = salario + aumento;
			System.out.println("O novo salário é: " + novo_sal);
		} else if (cargo == 3) {
			System.out.println("O cargo é Caixa");
			aumento = salario * 20 / 100;
			System.out.println("O valor do aumento é: " + aumento);
			novo_sal = salario + aumento;
			System.out.println("O novo salário é: " + novo_sal);
		} else if (cargo == 4) {
			System.out.println("O cargo é Gerente");
			aumento = salario * 10 / 100;
			System.out.println("O valor do aumento é: " + aumento);
			novo_sal = salario + aumento;
			System.out.println("O novo salário é: " + novo_sal);
		} else if (cargo == 5) {
			System.out.println("O cargo é Diretor");
			aumento = salario * 0 / 100;
			System.out.println("O valor do aumento é: " + aumento);
			novo_sal = salario + aumento;
			System.out.println("O novo salário é: " + novo_sal);
		} else
			System.out.println("Cargo Inexistente !");

	}

}
