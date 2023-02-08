package capitulotres;

import java.util.Scanner;

public class ExercicioDezoitoCapTres {

	public static void main(String[] args) {
		double peso_saco, racao_gato1, racao_gato2, total_final;

	    Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o peso do saco de ração (em Kg): ");

		peso_saco = entrada.nextDouble();
	
		System.out.print("Digite a ração consumida pelo 1º gato (em gramas): ");
	
		racao_gato1 = entrada.nextDouble();
	
		System.out.print("Digite a ração consumida pelo 2º gato (em gramas): ");
	
		racao_gato2 = entrada.nextDouble();
		
		racao_gato1 = racao_gato1 / 1000;
		
		racao_gato2 = racao_gato2 / 1000;
		
		total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
		
		System.out.println("Total de ração restante (em Kg): " + total_final);

	}

}
