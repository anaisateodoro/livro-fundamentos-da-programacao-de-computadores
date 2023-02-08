package capituloquatro;

import java.util.Scanner;

public class ExercicioCartozeCapQuatro {

	public static void main(String[] args) {
		
		double sal, novo_sal, boni=0, aux=0;
		Scanner entrada = new Scanner(System.in);  
		
  		System.out.println("Digite o valor do salário: ");
  		
  		sal = entrada.nextDouble();		
		
  		if (sal <= 500)
     	boni= sal * 5/100;
  		if (sal > 500 && sal < 1200)
     	boni=sal * 12/100;
  		if (sal >= 1200)
     	boni=0;
     	
  		if (sal <= 600)
     	aux=150;
  		if (sal > 600)
     	aux=100;
  		
  		novo_sal = sal + boni + aux;
  	
  		System.out.println("Novo salário = " + novo_sal);
	}

}
