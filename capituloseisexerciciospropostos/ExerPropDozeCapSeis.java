package capituloseisexerciciospropostos;
/*
 * Faça um programa que receba cinco números e mostre a saída a seguir:
Digite o 1º número 5
Digite o 2º número 3
Digite o 3º número 2
Digite o 4º número 0
Digite o 5º número 2
Os números digitados foram: 5 + 3 + 2 + 0 + 2 = 12
 */
import java.util.Scanner;

public class ExerPropDozeCapSeis {

	public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite abaixo cinco numeros:");
        System.out.println("-------------------");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º numero: ");
            numbers[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }

       
        System.out.print("Os numeros digitados foram: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]);
            if (i != 4) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }


	}


