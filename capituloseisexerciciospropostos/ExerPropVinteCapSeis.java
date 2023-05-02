package capituloseisexerciciospropostos;
import java.util.Arrays;
import java.util.Random;
public class ExerPropVinteCapSeis {

	public static void main(String[] args) {
		
		 int[] numbers = new int[10];
	        fillArrayWithRandomIntegers(numbers);
	        
	        displayPositiveNumbers(numbers);
	    }

	    private static void fillArrayWithRandomIntegers(int[] numbers) {
	        Random rand = new Random();
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = rand.nextInt(40) - 20; 
	        }
	        System.out.println("Numbers Generated: " + Arrays.toString(numbers));
	    }

	    private static void displayPositiveNumbers(int[] numbers) {
	        System.out.print("Positive Numbers: ");
	        for (int number : numbers) {
	            if (number > 0) {
	                System.out.print(number + " ");
	            }
	        }
	        System.out.println();
	    }
	
	}


