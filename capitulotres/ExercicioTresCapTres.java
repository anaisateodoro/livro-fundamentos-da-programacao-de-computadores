package capitulotres;

import java.util.Scanner;

public class ExercicioTresCapTres {

	public static void main(String[] args) {
		double nota1,nota2,nota3,peso1,peso2,peso3,media;
		Scanner entrada = new Scanner(System.in);
	    
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();	
		peso1 = entrada.nextFloat();
		peso2 = entrada.nextFloat();
		peso3 = entrada.nextFloat();	

		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)/(peso1 + peso2 + peso3);
		
		System.out.println(media);	

	}

}
