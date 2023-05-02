package capituloseisexerciciospropostos;

import java.util.Scanner;

/*
 * Faça um programa que receba dez números inteiros e armazene-os em um vetor. Calcule e mostre dois
vetores resultantes: o primeiro com os números pares e o segundo, com os números ímpares.
 */
public class ExerPropOnzeCapSeis {

	public static void main(String[] args) {
        int[] input = new int[10];
        int[] even = new int[10];
        int[] odd = new int[10];

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < 10; i++) {
            input[i] = scanner.nextInt();
        }

        
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (input[i] % 2 == 0) {
                even[evenIndex] = input[i];
                evenIndex++;
            } else {
                odd[oddIndex] = input[i];
                oddIndex++;
            }
        }

        
        System.out.print("Vetor com numeros pares: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor com numeros impares ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }


	}


