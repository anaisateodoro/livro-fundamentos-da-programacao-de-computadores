/*
 * Faça um programa que preencha um vetor com dez números reais, calcule e mostre a quantidade de números
negativos e a soma dos números positivos desse vetor. 
 */

package capituloseisexerciciospropostos;

import java.util.Scanner;

public class ExerPropSeteCapSeis {

	    public static void main(String[] args) {
	        double[] numeros = new double[10];
	        int qtdNegativos = 0;
	        double somaPositivos = 0;

	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Informe o valor da posição " + i + ":");
	            numeros[i] = scanner.nextDouble();
	        }

	        for (int i = 0; i < numeros.length; i++) {
	            if (numeros[i] < 0) {
	                qtdNegativos++;
	            } else if (numeros[i] > 0) {
	                somaPositivos += numeros[i];
	            }
	        }

	        System.out.println("Quantidade de números negativos: " + qtdNegativos);
	        System.out.println("Soma dos números positivos: " + somaPositivos);
	    }
	}
