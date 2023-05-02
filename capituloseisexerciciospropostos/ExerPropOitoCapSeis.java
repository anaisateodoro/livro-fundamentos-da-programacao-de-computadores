/*
 * Faça um programa que preencha um vetor com os nomes de sete alunos e carregue outro vetor com a média
final desses alunos. Calcule e mostre:
o nome do aluno com maior média (desconsiderar empates);
ara cada aluno não aprovado, isto é, com média menor que 7, mostrar quanto esse aluno precisa tirar na prova de exame final para ser aprovado. Considerar que a média para aprovação no exame é 5.
 * 
 */

package capituloseisexerciciospropostos;

import java.util.Scanner;

public class ExerPropOitoCapSeis {

	public static void main(String[] args) {
		
		

		        // Cria os vetores de nomes e notas
		        String[] nomes = new String[7];
		        double[] notas = new double[7];

		        // Lê os nomes e notas dos alunos
		        Scanner scanner = new Scanner(System.in);
		        for (int i = 0; i < 7; i++) {
		            System.out.print("Nome do aluno #" + (i+1) + ": ");
		            nomes[i] = scanner.nextLine();

		            System.out.print("Média final do aluno #" + (i+1) + ": ");
		            notas[i] = scanner.nextDouble();
		            scanner.nextLine(); // limpa o buffer de entrada
		        }

		        // Calcula a média mais alta
		        double maxNota = 0;
		        int maxNotaIndex = -1;
		        for (int i = 0; i < 7; i++) {
		            if (notas[i] > maxNota) {
		                maxNota = notas[i];
		                maxNotaIndex = i;
		            }
		        }
		        System.out.println("O aluno com a média mais alta é " + nomes[maxNotaIndex]);

		        // Calcula quanto falta para aprovar os alunos que não foram aprovados
		        System.out.println("Os alunos que não foram aprovados são:");
		        for (int i = 0; i < 7; i++) {
		            if (notas[i] < 7) {
		                double falta = 5 - notas[i];
		                System.out.println(nomes[i] + " precisa " + falta + " para passar no exame final.");
		            }
		        }
		    }
		

	}


