package capituloquatro;

import java.util.Scanner;

public class ExercicioOitoCapQuatro {

	public static void main(String[] args) {
		
		double num1, num2, soma, raiz;
 		int op;
		Scanner entrada = new Scanner(System.in);
		
 		System.out.println("1- Somar dois números");
 		System.out.println("2- Raiz quadrada de um número");
 		
 		System.out.print("Digite sua opção: ");
 	
 		op = entrada.nextInt();		
 		
 		if (op == 1)
    	{
    		System.out.print("Digite um valor para o primeiro número: ");
    		num1 = entrada.nextDouble();		
		    System.out.print("Digite um valor para o segundo número: ");
			num2 = entrada.nextDouble();		
		    soma = num1 + num2;
		    System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
    	}
 		
 		if (op == 2)
    	{
	      System.out.print("Digite um número: ");
	      num1 = entrada.nextDouble();		
	      raiz = Math.sqrt(num1);
	      System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
   		}
 		
 		if (op != 1 && op != 2)
    	System.out.println("Opção inválida !");
		
	}

}
