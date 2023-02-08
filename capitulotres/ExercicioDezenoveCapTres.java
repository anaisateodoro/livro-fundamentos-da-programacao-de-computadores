package capitulotres;

import java.util.Scanner;

public class ExercicioDezenoveCapTres {

	public static void main(String[] args) {
double a_degrau, a_usuario, qtd_degraus;
		
	    Scanner entrada = new Scanner(System.in);
	
		System.out.print("Digite a altura do degrau: ");
		
		a_degrau = entrada.nextDouble();
		
		System.out.print("Digite a altura desejada pelo usuário: ");
		
		a_usuario = entrada.nextDouble();
		
		qtd_degraus = a_usuario / a_degrau;
		
		System.out.println("Total de degraus necessários: " + qtd_degraus);

	}

}
