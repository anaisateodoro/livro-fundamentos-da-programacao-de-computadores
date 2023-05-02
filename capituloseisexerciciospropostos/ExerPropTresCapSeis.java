package capituloseisexerciciospropostos;

import java.util.Scanner;

public class ExerPropTresCapSeis {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] codigos = new int[2];
		int[] totalEstoque = new int[codigos.length];
		int codCliente, codProduto, qtdProduto;
		boolean existe;

		System.out.println();
		for (int i = 0; i < codigos.length; i++) {

			do {
				System.out.print("Digite o " + (i + 1) + "º código do produto: ");
				codigos[i] = scanner.nextInt();

				existe = false;
				for (int j = 0; j < i; j++) {
					if (codigos[i] == codigos[j]) {
						existe = true;
					}
				}

				if (existe == true) {
					System.out.println("\nO código deste produto já existe. Digite novamente\n");
				}
			} while (existe == true);

	
			do {
				System.out.print("Digite o total deste produto em estoque: ");
				totalEstoque[i] = scanner.nextInt();

				if (totalEstoque[i] < 0) {
					System.out.println("\nQuantidade inválida. Digite novamente.\n");
				}
			} while (totalEstoque[i] < 0);
		}

	
		do {
			System.out.print("\n\nCódigo do cliente (0 para encerrar): ");
			codCliente = scanner.nextInt();

		
			if (codCliente != 0) {
			
				do {
					System.out.print("Código do produto desejado: ");
					codProduto = scanner.nextInt();

					existe = false;
					for (int i = 0; i < codigos.length; i++) {
						if (codProduto == codigos[i]) {
							existe = true;

							do {
								System.out.print("Quantidade que deseja comprar: ");
								qtdProduto = scanner.nextInt();

								if (qtdProduto <= 0) {
									System.out.println("\nQuantidade inválida. Digite novamente.\n");
								}
							} while (qtdProduto <= 0);

							
							if (qtdProduto <= totalEstoque[i]) {
								totalEstoque[i] -= qtdProduto;
								System.out.println("\nPedido atendido. Obrigado e volte sempre.");
							} else {
								System.out.println("\nNão temos estoque suficiente dessa mercadoria.");
							}

							break;
						}
					}

				
					if (!existe) {
						System.out.println("\nCódigo inexistente\n");
					}
				} while (existe == false);
			}
		} while (codCliente != 0);

		System.out.println("\nEstoques atualizados: ");

		for (int i = 0; i < codigos.length; i++) {
			System.out.println("Código: " + codigos[i] + " - Estoque: " + totalEstoque[i]);
		}
scanner.close();
	}

}









       