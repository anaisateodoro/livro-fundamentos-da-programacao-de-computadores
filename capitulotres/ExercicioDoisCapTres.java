package capitulotres;

import java.util.Scanner;

public class ExercicioDoisCapTres {

	public static void main(String[] args) 
	{
		
		double nota1,nota2,nota3,media;
		Scanner entrada = new Scanner(System.in); 
   	  
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		nota3 = entrada.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println(media);
	}
}


