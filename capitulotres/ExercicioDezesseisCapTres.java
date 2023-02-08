package capitulotres;

import java.util.Scanner;

public class ExercicioDezesseisCapTres {

	public static void main(String[] args) {
double horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bru, imp, vlr_sal_liq;
		
	    Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o total de horas trabalhadas: ");
		
		horas_t = entrada.nextDouble();
		
		System.out.print("Digite o valor do salário mínimo: ");
		
		vlr_sal_min = entrada.nextDouble();
		
		vlr_hora_t =  vlr_sal_min / 2;
		
		vlr_sal_bru = vlr_hora_t * horas_t;
	
		imp = vlr_sal_bru * 3 / 100;
	
		vlr_sal_liq = vlr_sal_bru - imp;
		
		System.out.println("O salário a receber é: " + vlr_sal_liq);

	}

}
