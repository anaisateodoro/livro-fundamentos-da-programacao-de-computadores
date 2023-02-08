package capitulotres;

import java.util.Scanner;

public class ExercicioQuatroCapTres {

	public static void main(String[] args) {
		double sal, novosal;	
		   
	    Scanner entrada = new Scanner(System.in);
   	  
  		System.out.println("Digite o salário do funcionário: ");
  		
		sal = entrada.nextDouble();
  	
  		novosal = sal + sal * 1.25; //Ou 25/100
  		
  		System.out.println("Novo salário = " + novosal);

	}

}
