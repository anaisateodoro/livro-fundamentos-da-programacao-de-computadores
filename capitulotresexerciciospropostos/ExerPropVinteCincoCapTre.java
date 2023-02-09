package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropVinteCincoCapTre {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int hora, minuto, convHoraMinuto, totalMinuto, convMinSegundo;

		System.out.print("Digite a hora: ");
		hora = entrada.nextInt();
		System.out.print("Digite os minutos: ");
		minuto = entrada.nextInt();

		convHoraMinuto = hora * 60;
		totalMinuto = minuto + convHoraMinuto;
		convMinSegundo = totalMinuto * 60;

		System.out.println("\n" + hora + " hora(s) em minutos " + convHoraMinuto);
		System.out.println("Total de minutos: " + totalMinuto);
		System.out.println("Total de minutos em segundos: " + convMinSegundo);

	}

}
