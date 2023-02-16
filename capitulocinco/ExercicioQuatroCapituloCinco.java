package capitulocinco;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioQuatroCapituloCinco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		int codigo, numVeiculo, numAcidente, indMaior = 0, indMenor = 0, cidIndMaior = 0, cidIndMenor = 0,
				somaVeiculo = 0, somaAcidente = 0, qtdCidade = 0;
		float mediaVeiculo = 0, mediaAcidente = 0;

		// Laço de repetição referente a quantidade de cidades
		for (int i = 1; i <= 5; i++) {
			// Coletar dados
			System.out.print("\nDigite o código da cidade: ");
			codigo = entrada.nextInt();
			System.out.print("Digite a quantidade de veículos de passeio no mês: ");
			numVeiculo = entrada.nextInt();
			System.out.print("Digite a quantidade de acidentes de trânsito com vítimas no mês: ");
			numAcidente = entrada.nextInt();

			// Desvio condicional referente ao menor e maior índice
			if (i == 1) {
				indMaior = numAcidente;
				cidIndMaior = codigo;
				indMenor = numAcidente;
				cidIndMenor = codigo;
			} else {
				if (indMaior < numAcidente) {
					indMaior = numAcidente;
					cidIndMaior = codigo;
				}
				if (indMenor > numAcidente) {
					indMenor = numAcidente;
					cidIndMenor = codigo;
				}
			}

			
			somaVeiculo = somaVeiculo + numVeiculo;
			mediaVeiculo = somaVeiculo / 5;

			// Desvio condicional referente a média de acidente
			if (numVeiculo < 2000) {
				qtdCidade++;
				somaAcidente = somaAcidente + numAcidente;
				mediaAcidente = somaAcidente / qtdCidade;
			}
		}

		
		System.out.println(
				"\nO maior índice de acidentes de trânsito é " + indMaior + " da cidade do código " + cidIndMaior);
		System.out.println(
				"O menor índice de acidentes de trânsito é " + indMenor + " da cidade do código " + cidIndMenor);
		System.out.println("A média de veículos nas cinco cidades é " + casas.format(mediaVeiculo));
		System.out.println("A média de acidentes em cidades com menos de 2000 veículos de passeio: "
				+ casas.format(mediaAcidente) + "\n");

		entrada.close();
	}

}
