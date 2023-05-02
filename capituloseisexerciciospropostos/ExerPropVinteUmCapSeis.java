package capituloseisexerciciospropostos;
import java.util.Arrays;
import java.util.Scanner;

public class ExerPropVinteUmCapSeis {
	public static int[] readIntegers(int size) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter an integer for position " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }

        return numbers;
    }

    public static int[] createSecondArray(int[] inputArray) {
        int[] secondArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            secondArray[i] = inputArray[i] * 2;
        }

        return secondArray;
    }

    public static void main(String[] args) {
        int size = 10;
        int[] firstArray = readIntegers(size);
        int[] secondArray = createSecondArray(firstArray);

        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
    }
}

