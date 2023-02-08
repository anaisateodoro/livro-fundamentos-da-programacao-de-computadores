package capituloquatro;

import java.util.Scanner;

public class ExercicioQutroCapQuatro {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		
		num1 = entrada.nextInt();		
	
		System.out.print("Digite o segundo número: ");
	
		num2 = entrada.nextInt();		
	
		System.out.print("Digite o terceiro número: ");
	
		num3 = entrada.nextInt();		
		
		if (num1 < num2 && num1 < num3)
		 {
		   if (num2 < num3)
      		System.out.println("A ordem crescente dos números é: " + num1 + " - " + num2 + " - " + num3);
   		   if (num3 < num2)	
   			System.out.println("A ordem crescente dos números é: " + num1 + " - " + num3 + " - " + num2);
		 }   
		if (num2 < num1 && num2 < num3)
		 {
		   if (num1 < num3)
      		System.out.println("A ordem crescente dos números é: " + num2 + " - " + num1 + " - " + num3);
   		   if (num3 < num1)	
   			System.out.println("A ordem crescente dos números é: " + num2 + " - " + num3 + " - " + num1);
		 }   
		if (num3 < num1 && num3 < num2)
		 {
		   if (num1 < num2)
      		System.out.println("A ordem crescente dos números é: " + num3 + " - " + num1 + " - " + num2);
   		   if (num2 < num1)	
   			System.out.println("A ordem crescente dos números é: " + num3 + " - " + num2 + " - " + num1);
		 }   
	}

}
