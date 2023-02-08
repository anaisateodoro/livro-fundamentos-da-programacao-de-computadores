package capitulotres;

import java.util.Scanner;

public class ExercicioVinteCapTres {

	public static void main(String[] args) {
		
		Double ang, alt, escada, radiano;
		
	    Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do ângulo em graus: ");
		
		ang = entrada.nextDouble();
		
		System.out.print("Digite a altura da parede onde está a ponta da escada: ");
		
		alt = entrada.nextDouble();
		
		radiano = ang * 3.14 / 180;
		
		escada = alt / Math.sin(radiano);
		
		System.out.println("O comprimento da escada é "+ escada);
	}

}
