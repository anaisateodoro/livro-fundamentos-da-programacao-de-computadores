package capituloquatro;

import java.util.Scanner;

public class ExercicioSeteCapQuatro {
	int A,B,C,I;
	Scanner entrada = new Scanner(System.in);
	{
		System.out.print("Digite um valor para A: ");
	
		A = entrada.nextInt();		
		
		System.out.print("Digite um valor para B: ");
	
		B = entrada.nextInt();		
		
		System.out.print("Digite um valor para C: ");
	
		C = entrada.nextInt();		
	
		System.out.print("Digite um valor para I (1, 2 ou 3): ");

	I = entrada.nextInt();		
		
		if (I==1)
		{
		if (A<B && A<C)
   		  {
   		  	if (B<C)
  			 System.out.println("A ordem crescente dos números é: " + A + " - " + B + " - " + C);
   			else
  			 System.out.println("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
  		  }	 
		if (B<A && B<C)
		  {
		  	if (A<C)
  			 System.out.println("A ordem crescente dos números é: " + B + " - " + A + " - " + C);
   			else
  			 System.out.println("A ordem crescente dos números é: " + B + " - " + C + " - " + A);
  		  }	 
		if (C<A && C<B)
		  {
		    if (A<B)
  			 System.out.println("A ordem crescente dos números é: " + C + " - " + A + " - " + B);
   			else
  			 System.out.println("A ordem crescente dos números é: " + C + " - " + B + " - " + A);
			  }
	 	}		  
		
		if (I==2)
		{
	if (A>B && A>C)
   		  {
   		  	if (B>C)
  			 System.out.println("A ordem decrescente dos números é: " + A + " - " + B + " - " + C);
   			else
  			 System.out.println("A ordem decrescente dos números é: " + A + " - " + C + " - " + B);
  		  }	 
		if (B>A && B>C)
		  {
		  	if (A>C)
  			 System.out.println("A ordem decrescente dos números é: " + B + " - " + A + " - " + C);
   			else
  			 System.out.println("A ordem decrescente dos números é: " + B + " - " + C + " - " + A);
  		  }	 
		if (C>A && C>B)
		  {
		    if (A>B)
  			 System.out.println("A ordem decrescente dos números é: " + C + " - " + A + " - " + B);
   			else
  			 System.out.println("A ordem decrescente dos números é: " + C + " - " + B + " - " + A);
			  }
	}
		
		if (I==3)
		{
	if (A>B && A>C)
   	 System.out.println("A ordem desejada é: " + B + " - " + A + " - " + C);
	if (B>A && B>C)
   	 System.out.println("A ordem desejada é: " + A + " - " + B + " - " + C);
	if (C>A && C>B)
   	 System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);
		}
}
}

