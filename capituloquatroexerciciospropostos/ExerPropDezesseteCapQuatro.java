package capituloquatroexerciciospropostos;

import java.util.Scanner;

public class ExerPropDezesseteCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String password, username;

		System.out.print("\nDigite o nome de usuário: ");
		username = entrada.nextLine();
		System.out.print("Digite a senha: ");
		password = entrada.nextLine();

		if (password.equals("4531")) {

			System.out.println("\nAcesso permitido.");
			System.out.println("Olá " + username + "\n");
		} else {
			System.out.println("\nAcesso negado, senha inválida!\n");
		}

	}

}
