package capitulotres;

import java.util.Scanner;

public class ExercicioCatorzeCapTres {

	public static void main(String[] args) {
		int ano_atual, ano_nasc, id_atual, id_2050;
		Scanner entrada = new Scanner(System.in);		
	  
		System.out.print("Digite o ano de nascimento: ");
		
		ano_nasc = entrada.nextInt();
  
  		System.out.print("Digite o ano atual: ");
  		
  		ano_atual = entrada.nextInt();
  		
  		id_atual = ano_atual - ano_nasc;
  		
  		id_2050 = 2050 - ano_nasc;
  	
  		System.out.println("A idade atual é: "+id_atual);
  		
  		System.out.println("A idade em 2050 será: "+id_2050);

	}

}
