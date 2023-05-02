package capituloseisexerciciospropostos;
import java.util.Scanner;
public class ExerPropTrezeCapSeis {
		
		public static void main(String[] args) {
		
		        String[] names = new String[8];
		        double[] grades = new double[8];
		        double sum = 0.0;

		        Scanner scanner = new Scanner(System.in);

		        
		        for (int i = 0; i < 8; i++) {
		            System.out.print("Digite o nome do " + (i+1) + "º estudante: ");
		            names[i] = scanner.nextLine();
		            System.out.print("Digite a nota do(a) : " + names[i]);
		            grades[i] = scanner.nextDouble();
		            scanner.nextLine(); 
		        }

		        
		        for (int i = 0; i < 8; i++) {
		            sum += grades[i];
		        }
		        double average = sum / 8.0;

		       
		        System.out.println("------------");
		        System.out.println("Relatório de notas");
		        for (int i = 0; i < 8; i++) {
		            System.out.println(names[i] + " " + grades[i]);
		        }
		        System.out.println("------------");
		        System.out.println("Média da Turma = " + average);
	scanner.close();	    
}


}

