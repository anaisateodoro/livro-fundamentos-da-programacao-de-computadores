package capituloseisexerciciospropostos;

import java.util.Scanner;

public class ExerPropQuinzeCapSeis {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        
	        String[] customerNames = new String[8];
	        int[] rentals = new int[8];
	        int[] freeRentals = new int[8];
	        
	        
	        for (int i = 0; i < 8; i++) {
	            System.out.print("Digite o nome do cliente " + (i+1) + ": ");
	            customerNames[i] = scanner.nextLine();
	            
	            System.out.print("Digite o numero de DVDs alugados em 2023: ");
	            rentals[i] = scanner.nextInt();
	            scanner.nextLine(); 
	            
	           
	            freeRentals[i] = rentals[i] / 10;
	        }
	        
	       
	        System.out.println("Relatorio Locadora de DVDs");
	        System.out.println("-----------------");
	        System.out.println("Nome\tAlugados\tLocacao Gratis");
	        for (int i = 0; i < 8; i++) {
	            System.out.println(customerNames[i] + "\t" + rentals[i] + "\t" + freeRentals[i]);
	        }
	    }

	}


