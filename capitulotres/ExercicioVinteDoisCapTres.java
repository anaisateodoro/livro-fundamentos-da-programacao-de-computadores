package capitulotres;

import java.util.Scanner;

public class ExercicioVinteDoisCapTres {

	public static void main(String[] args) {
		double vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
		
	    Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do salário mínimo: ");
		
		vlr_sal = entrada.nextDouble();
	
		System.out.print("Digite a quantidade de Kws consumidos: ");
		
		qtd_kw = entrada.nextDouble();		
	
		vlr_kw = vlr_sal / 5;
		
		vlr_reais = vlr_kw * qtd_kw;
		
		desc = vlr_reais * 15 / 100;
		
		vlr_desc = vlr_reais - desc;
	
		System.out.println("Valor do Kw: "+ vlr_kw);
		
		System.out.println("Valor a ser pago: " + vlr_reais);
	
		System.out.println("Valor a ser pago com desconto: " + vlr_desc);

	}

}
