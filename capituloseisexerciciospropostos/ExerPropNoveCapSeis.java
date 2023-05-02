package capituloseisexerciciospropostos;
import java.util.Scanner;
public class ExerPropNoveCapSeis {

	public static void main(String[] args) {
		        String[] products = new String[10];
		        int[] codes = new int[10];
		        double[] prices = new double[10];

		        Scanner scanner = new Scanner(System.in);
		        
		        // preencher as matrizes com a entrada do utilizador
		        for (int i = 0; i < 10; i++) {
		            System.out.print("Digite o nome do produto: ");
		            products[i] = scanner.nextLine();

		            System.out.print("Digite o codigo do produto: ");
		            codes[i] = scanner.nextInt();
		            scanner.nextLine(); // consume the newline character

		            System.out.print("Digite o preco do produto ");
		            prices[i] = scanner.nextDouble();
		            scanner.nextLine(); // consume the newline character
		        }
		        
		        // checking for products that will be increased
		        System.out.println("Produto\tCodigo\tPreco\tNovo Preco");
		        for (int i = 0; i < 10; i++) {
		            double newPrice;
		            if (codes[i] % 2 == 0 && prices[i] > 100) { // satisfies both conditions
		                newPrice = prices[i] * 1.2;
		            } else if (codes[i] % 2 == 0) { // satisfies only the code condition
		                newPrice = prices[i] * 1.15;
		            } else if (prices[i] > 100) { // satisfies only the price condition
		                newPrice = prices[i] * 1.1;
		            } else {
		                continue; // no increase needed, skip to the next product
		            }
		            System.out.println(products[i] + "\t" + codes[i] + "\t" + prices[i] + "\t" + newPrice);
		        }
		    }
		
		

	}


