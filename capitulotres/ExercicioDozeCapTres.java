package capitulotres;

import java.util.Scanner;

public class ExercicioDozeCapTres {

	public static void main(String[] args) {
		double num1, num2, r1, r2;
		
		Scanner entrada = new Scanner(System.in);
   	   
		System.out.println("Digite o 1º número: ");
		
		num1 = entrada.nextDouble();
		
		System.out.println("Digite o 2º número: ");
	
		num2 = entrada.nextDouble();
	
		r1 = Math.pow (num1, num2);
		
		r2 = Math.pow (num2, num1);
	
		System.out.println("Resposta 1 = " + r1);
	
		System.out.println("Resposta 2 = " + r2);

	}

}
