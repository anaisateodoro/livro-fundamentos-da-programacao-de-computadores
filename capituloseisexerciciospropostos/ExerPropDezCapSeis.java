package capituloseisexerciciospropostos;

import java.util.Scanner;

public class ExerPropDezCapSeis {

	public static void main(String[] args) {	


		        int[] array1 = new int[10];
		        int[] array2 = new int[5];

		        Scanner scanner = new Scanner(System.in);
		        
		        
		        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
		        for (int i = 0; i < 10; i++) {
		            array1[i] = scanner.nextInt();
		        }
		        
		        
		        System.out.println("Digite 5 números inteiros para o segundo vetor:");
		        for (int i = 0; i < 5; i++) {
		            array2[i] = scanner.nextInt();
		        }
		        
		        
		        int sum = 0;
		        for (int i = 0; i < 10; i++) {
		            if (array1[i] % 2 == 0) {
		                sum += array1[i];
		            }
		        }
		        for (int i = 0; i < 5; i++) {
		            sum += array2[i];
		        }
		        int[] result1 = {sum};
		        
		        // calcular o segundo vetor resultante
		        int[] result2 = new int[5];
		        for (int i = 0; i < 10; i++) {
		            if (array1[i] % 2 != 0) {
		                for (int j = 0; j < 5; j++) {
		                    if (array2[j] == 0) {
		                        continue; 
		                    }
		                    if (array1[i] % array2[j] == 0) {
		                        result2[i] += 1;
		                    }
		                }
		            }
		        }
		        
		       
		        System.out.print("Resultado vetor 1: ");
		        for (int i = 0; i < result1.length; i++) {
		            System.out.print(result1[i] + " ");
		        }
		        System.out.println();
		        
		        System.out.print("Resultado vetor 2: ");
		        for (int i = 0; i < result2.length; i++) {
		            System.out.print(result2[i] + " ");
		        }
		        System.out.println();
		    }
		

}


