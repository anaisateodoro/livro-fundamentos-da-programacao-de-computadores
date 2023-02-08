package capituloquatro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVinteQuatroCapQuatro {

	public static void main(String[] args) {
		double pre, valor_adic=0, imposto, pre_custo, desconto, novo_pre;
  		char tipo, refrig;
  		Scanner entrada = new Scanner(System.in);
  		DecimalFormat casas = new DecimalFormat ("0.00"); 
  		
		System.out.println("Digite o preço do produto ");
		
		pre = entrada.nextDouble(); 
		
		System.out.println("Digite o tipo do produto (A - alimentação, L - Limpeza e V - Vestuário) ");
  		
  		tipo = entrada.next().charAt(0);
  		
  		System.out.println("Digite S ou N para a necessidade de refrigeração do produto ");
  		
  		refrig = entrada.next().charAt(0);
	
  		if (refrig == 'N')
     	{ 
     		if (tipo == 'A')
	  		{ 
	  			if (pre < 15)
	       		  valor_adic = 2;
	    		else
	       		  valor_adic = 5;
	  		}
			if (tipo == 'L')
	   		{ 
	   			if (pre < 10)
				  valor_adic = 1.50;
	     		else
				  valor_adic = 2.50;
	   		}
	 		if (tipo == 'V')
	    	{ 
	    		if (pre < 30)
		 		  valor_adic = 3;
	      		else 
	      		  valor_adic = 2.5;
	     	}
    	}
  	   else
     	{ 
     		if (tipo == 'A')
	  		  valor_adic = 8;
       		if (tipo == 'L')
	  		  valor_adic = 0;
       		if (tipo == 'V')
	  		  valor_adic = 0;
    	}
  		System.out.println("Valor adicional = "+casas.format(valor_adic));
  		
  		if (pre < 25)
     	  imposto = pre * 5/100;
  		else
     	  imposto = pre * 8/ 100;
     	
  		System.out.println("Valor do imposto = "+casas.format(imposto));
  	
  		pre_custo = pre + imposto;
  		
  		System.out.println("Valor do preço de custo = "+casas.format(pre_custo));
  		
  		if (tipo != 'A' && refrig != 'S')
     	  desconto = pre_custo * 3/ 100;
  		else
     	  desconto = 0;
    
  		System.out.println("Valor do desconto = "+casas.format(desconto));
  	
  		novo_pre = pre + valor_adic - desconto;
  	
  		System.out.println("Valor do novo preço = "+casas.format(novo_pre));
  		
  		if (novo_pre <= 50)
     	  System.out.println("Barato");
  		else if (novo_pre < 100)
			  System.out.println("Normal");
     		else	
			  System.out.println("Caro");

	}

}
