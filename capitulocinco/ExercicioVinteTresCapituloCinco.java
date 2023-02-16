package capitulocinco;

import java.util.Scanner;

public class ExercicioVinteTresCapituloCinco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
  		float sal, qtd, tipo, valor_kw, gasto, acresc, total, tot_geral, qtd_cons;
		tot_geral = 0;
  		qtd_cons = 0;
  		acresc=0;
  		System.out.println("Digite o valor do salário mínimo ");
  		sal = entrada.nextFloat();
  		valor_kw = sal / 8;
  		System.out.println("Digite a quantidade de Kw consumida ");
  		qtd = entrada.nextFloat();
		while (qtd != 0)
		{ 
			gasto = qtd * valor_kw;
			System.out.println("Digite o tipo do consumidor (1- Residencial, 2- Comercial, 3-Industrial) ");
			tipo = entrada.nextFloat();
			if (tipo == 1)
				acresc = gasto * 5 / 100;
			if (tipo == 2)
				acresc = gasto * 10 / 100;
			if (tipo == 3)
				acresc = gasto * 15 / 100;
			total = gasto + acresc;
			tot_geral = tot_geral + total;
			if (total >= 500 && total <=1000)
				qtd_cons = qtd_cons + 1;
			System.out.println("Valor gasto = " +gasto);
			System.out.println("Valor acréscimo = "+acresc);
			System.out.println("Valor final = "+total);
			System.out.println("\nDigite a quantidade de Kw consumida ");
			qtd = entrada.nextFloat();
	 }
	System.out.println("Total geral consumido = "+tot_geral);
	System.out.println("Total de consumidores que pagam entre 500 e 1000 reais = "+qtd_cons);


	}

}
