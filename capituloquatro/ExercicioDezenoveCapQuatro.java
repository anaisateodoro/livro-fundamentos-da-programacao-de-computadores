package capituloquatro;

import java.util.Scanner;

public class ExercicioDezenoveCapQuatro {

	public static void main(String[] args) {
		
		double altura, peso;
		Scanner 	entrada = new Scanner(System.in);
	
  		System.out.print("Digite a altura ");
  		
  		altura = entrada.nextDouble();				
  		
  		System.out.println("Digite o peso ");
  		
  		peso = entrada.nextDouble();				
  		
  		if (altura < 1.20)
     	{ 
     		if (peso <= 60)
	  		System.out.println("Classificação A ");
       		if (peso > 60 && peso <= 90)
	  		System.out.println("Classificação D ");
       		if (peso > 90)
	  		System.out.println("Classificação G ");
     	}
  		if (altura >= 1.20 && altura <= 1.70)
     	{
     		if (peso <= 60)
	  		System.out.println("Classificação B ");
       		if (peso > 60 && peso <= 90)
	  		System.out.println("Classificação E ");
       		if (peso > 90)
	  		System.out.println("Classificação H ");
     	}
  		if (altura > 1.70)
     	{ 
     		if (peso <= 60)
	  		System.out.println("Classificação C ");
       		if (peso > 60 && peso <= 90)
	  		System.out.println("Classificação F ");
       		if (peso > 90)
	  		System.out.println("Classificação I ");
	  	}
	}

}
