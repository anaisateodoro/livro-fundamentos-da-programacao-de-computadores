package capituloquatro;

import java.util.Scanner;

public class ExercicioDoisCapQuatro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaA, notaExame;
		
		System.out.println("Digite a nota 1: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		nota3 = entrada.nextDouble();
		
		mediaA = (nota1 + nota2 + nota3)/3;
		
		if (mediaA >= 0 && mediaA<3) {
			System.out.println("Reprovado");
		}
		else if(mediaA >= 3 && mediaA<7) {
			System.out.println("Exame");
			notaExame = 10 - mediaA;
		}
		else if (mediaA>=7 && mediaA<=10) {
			System.out.println("Aprovado");
		}

	}

}
