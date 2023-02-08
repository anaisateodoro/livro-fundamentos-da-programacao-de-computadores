package capitulotres;

import java.util.Scanner;

public class ExercicioVinteQuatroCapTres {

	public static void main(String[] args) {
		double hora, conversao, m;
 		int h;
	    Scanner entrada = new Scanner(System.in);	
       	System.out.print("Digite a hora e os minutos, por exemplo, 4,30: ");		
		hora = entrada.nextDouble();		
		h = (int)hora;
		m = hora - h;		
		conversao = h * 60 + m * 100;
		conversao = Math.ceil(conversao);		
		System.out.println("Hora convertida para minutos: " + conversao);

	}

}
