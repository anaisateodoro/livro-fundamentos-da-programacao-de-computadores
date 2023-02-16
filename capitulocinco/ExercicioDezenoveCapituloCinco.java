package capitulocinco;

import java.util.Scanner;

public class ExercicioDezenoveCapituloCinco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
  		int m, n, soma, i;
  		System.out.println("Digite um valor para m ");
  		m = entrada.nextInt();
  		System.out.println("Digite um valor para n ");
  		n = entrada.nextInt();
  		while (m < n)
    	{ 
    		soma = 0;
      		for (i=m;i<=n;i++)
				soma = soma + i;
			System.out.println("Soma dos inteiros entre "+m+" e "+n+" = "+soma);
			System.out.println("Digite um valor para m ");
			m = entrada.nextInt();
			System.out.println("Digite um valor para n ");
      		n = entrada.nextInt();

	}
	}
}
