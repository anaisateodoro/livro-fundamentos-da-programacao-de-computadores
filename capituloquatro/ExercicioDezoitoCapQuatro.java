package capituloquatro;

import java.util.Scanner;

public class ExercicioDezoitoCapQuatro {

	public static void main(String[] args) {
		double x, y, z;
		Scanner	entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		
		x = entrada.nextDouble();				
		
  		System.out.print("Digite o valor de y: ");
	
		y = entrada.nextDouble();				
		
  		System.out.print("Digite o valor de z: ");
  		
		z = entrada.nextDouble();				
	
		if (x < y + z && y < x + z && z < x + y)
     		{ 
     			if (x == y && y == z)
	  			 System.out.println("Triângulo Equilátero");
       			else if (x == y || x == z || y == z)
	     			  System.out.println("\nTriângulo Isósceles");
	  				 else if (x != y && x != z && y != z)
						   System.out.println("Triângulo Escaleno");
     		}
  		else System.out.println("Estas medidas não formam um triângulo");

	}

}
