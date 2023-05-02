package capituloseisexerciciospropostos;

import java.util.Scanner;

public class ExerPropQuatroCapSeis {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[15];
        boolean existe;

        // Preenche o vetor de números
        System.out.println();
        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite o "+(i+1)+"º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        // Verifica se há elementos iguais a 30
        existe = false;
        System.out.println();
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] == 30) {
                existe = true;
                System.out.println("O elemento na posição "+i+" é igual a 30 (o índice começa do 0)");
            }
        }

        // Caso não exista elementos iguais a 30
        if (existe == false) {
            System.out.println("Não houve números iguais a 30");
        }

	}

}
