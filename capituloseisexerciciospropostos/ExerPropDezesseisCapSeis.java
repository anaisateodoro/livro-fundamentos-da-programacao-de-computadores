package capituloseisexerciciospropostos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerPropDezesseisCapSeis {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	    // Solicita o nome e preço de cada produto
	    System.out.print("Nome do produto e seu preço (separados por espaço): ");
	    String[] nomesPreços = scanner.nextLine().split(" ");
   

        List<Produto> produtos = new ArrayList<>();
        for (int i = 0; i < nomesPreços.length; i += 2) {
            String nome = nomesPreços[i];
            double preco = Double.parseDouble(nomesPreços[i + 1]);
            Produto produto = new Produto(nome, preco);
            produtos.add(produto);
        }

	    // Verifica quantidade de produtos com preço inferior a R$ 50,00
	    int quantidadeMenor50 = 0;
	    for (Produto produto : produtos) {
	        if (produto.getPreco() < 50.0) {
	            quantidadeMenor50++;
	        }
	    }
	    System.out.println("Quantidade de produtos com preço inferior a R$ 50,00: " + quantidadeMenor50);

	    // Verifica nome dos produtos com preço entre R$ 50,00 e R$ 100,00
	    List<String> nomes50A100 = new ArrayList<>();
	    for (Produto produto : produtos) {
	        if (produto.getPreco() >= 50.0 && produto.getPreco() <= 100.0) {
	            nomes50A100.add(produto.getNome());
	        }
	    }
	    System.out.println("Nomes dos produtos com preço entre R$ 50,00 e R$ 100,00: " + String.join(", ", nomes50A100));

        // Calcula e exibe a média dos preços dos produtos com preço superior a R$ 100,00
        double media = 0;
        for (Produto produto : produtos) {
            if (produto.getPreco() > 100.0) {
                media += produto.getPreco();
            }
        }
        media /= produtos.size();
        System.out.println("Média dos preços dos produtos com preço superior a R$ 100,00: " + media);
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

	    
	}


