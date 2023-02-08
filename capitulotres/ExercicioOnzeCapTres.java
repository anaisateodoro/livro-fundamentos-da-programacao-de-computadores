package capitulotres;

import java.util.Scanner;

public class ExercicioOnzeCapTres {

	public static void main(String[] args) {
		double num, quad, cubo, r2, r3;
		Scanner entrada = new Scanner(System.in);
   	  
		System.out.print("Digite um número: ");
		
		num = entrada.nextDouble();
	
		quad = Math.pow(num,2);
	
		cubo = Math.pow(num,3);
		
		r2 = Math.sqrt(num);
		
		r3 = Math.cbrt(num);
		
		System.out.println("Número ao quadrado  = " + quad);
		
		System.out.println("Número ao cubo  = " + cubo);
		
		System.out.println("Raiz quadrada   = " + r2);
		
		System.out.println("Raiz cúbica  = " + r3);
	}

}
