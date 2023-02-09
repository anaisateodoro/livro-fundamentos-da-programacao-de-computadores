package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropVinteUmCapTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    DecimalFormat casas = new DecimalFormat("0.00");
	    int horaTrabalhada, horaExtra;
	    float salMinimo, valHoraTrabalhada, valHoraExtra, salBruto, quantExtra, salLiquido;

	    
	    System.out.print("\nDigite o número de horas trabalhadas: ");
	    horaTrabalhada = entrada.nextInt();
	    System.out.print("Digite o valor do salário mínimo: ");
	    salMinimo = entrada.nextFloat();
	    System.out.print("Digite o número de horas extras: ");
	    horaExtra = entrada.nextInt();

	    
	    valHoraTrabalhada = salMinimo / 8;
	    valHoraExtra = salMinimo / 4;
	    salBruto = horaTrabalhada * valHoraTrabalhada;
	    quantExtra = horaExtra * valHoraExtra;
	    salLiquido = salBruto + quantExtra;

	   
	    System.out.println("\nValor da hora trabalhada: R$"+casas.format(valHoraTrabalhada));
	    System.out.println("Valor da hora extra: R$"+casas.format(valHoraExtra));
	    System.out.println("Salário bruto: R$"+casas.format(salBruto));
	    System.out.println("Quantia das horas extras: R$"+casas.format(quantExtra));
	    System.out.println("Salário líquido: R$"+casas.format(salLiquido));
	}

}
