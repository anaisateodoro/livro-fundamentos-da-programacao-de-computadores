package capituloquatro;

import java.util.Scanner;

public class ExercicioOnzeCapQuatro {

	public static void main(String[] args) {
		
		int hora_i, min_i, hora_f, min_f, hora_d, min_d;
		Scanner entrada = new Scanner(System.in);  
 		
 		System.out.println("Digite o horário inicial");
 		System.out.print("Hora: ");
		
		hora_i = entrada.nextInt();		
 		System.out.print("Minuto: ");
 		
  		min_i = entrada.nextInt();		
 		
 		System.out.println("Digite o horário final");
 		System.out.print("Hora: ");
 	
 		hora_f = entrada.nextInt();		
 		System.out.print("Minuto: ");
 		
 		min_f = entrada.nextInt();		
 	
 		if (min_i > min_f)
    	  { 
    		min_f = min_f + 60;
      		hora_f = hora_f - 1;
    	  }
  	
 		if (hora_i > hora_f)
    		hora_f = hora_f + 24;
 		
 		min_d = min_f - min_i;
 		hora_d = hora_f - hora_i;
 		
 		System.out.println("O jogo durou " + hora_d + " hora(s) e " + min_d + " minuto(s)");
	}

}
