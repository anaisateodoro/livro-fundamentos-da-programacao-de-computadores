package capitulocinco;

import java.util.Scanner;

public class ExercicioOnzeCapituloCinco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
  		int i, num, qtde;
  		System.out.print("Digite um número: ");
  		num = entrada.nextInt();
  		qtde = 0;
  		for (i=1;i<=num;i++)
		 {
			if (num%i == 0)
				qtde = qtde + 1;
		 }
		if (qtde > 2)
		 System.out.println("Número não primo");
  		else
     	 System.out.println("Número primo");

	}

}
