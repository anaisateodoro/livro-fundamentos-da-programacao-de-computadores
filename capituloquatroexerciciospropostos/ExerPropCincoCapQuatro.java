package capituloquatroexerciciospropostos;

import java.util.Scanner;

public class ExerPropCincoCapQuatro {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        float num1, num2, operacao;
        int opcao;

        
        System.out.println("\nDigite dois números:");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        System.out.print("Escolha que operação deseja fazer:\n[1] - Média entre os números digitados\n[2] - Diferença do maior pelo menor\n[3] - Produto entre  os números digitados\n[4] - Divisão do primeiro pelo segundo\n<< ");
        opcao = entrada.nextInt();

       
        switch (opcao) {
            case 1 -> {
                operacao = (num1 + num2) / 2;
                System.out.println("\n(" + num1 + " + " + num2 + ") / 2 = " + operacao + "\n");
            }

            case 2 -> {
                if (num1 != num2) {
                    if (num1 > num2) {
                        operacao = num1 - num2;
                        System.out.println("\n" + num1 + " - " + num2 + " = " + operacao + "\n");
                    } else {
                        operacao = num2 - num1;
                        System.out.println("\n" + num2 + " - " + num1 + " = " + operacao + "\n");
                    }
                } else {
                    System.out.println("\nOs números são iguais. O resultado é 0\n");
                }
            }

            case 3 -> {
                operacao = num1 * num2;
                System.out.println("\n" + num1 + " x " + num2 + " = " + operacao + "\n");
            }

            case 4 -> {
                if (num2 != 0) {
                    operacao = num1 / num2;
                    System.out.println("\n" + num1 + " / " + num2 + " = " + operacao + "\n");
                } else {
                    System.out.println("\nNão existe divisão com divisor 0\n");
                }
            }

            default ->
                System.out.println("\nOpção inválida\n");

        }

	}

}
