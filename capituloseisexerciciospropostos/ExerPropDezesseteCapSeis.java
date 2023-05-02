package capituloseisexerciciospropostos;

import java.util.Arrays;
import java.util.Scanner;

public class ExerPropDezesseteCapSeis {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		System.out.println("Enter 10 integers for array 1:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = input.nextInt();
		}

		System.out.println("Enter 10 integers for array 2:");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = input.nextInt();
		}

		int[] arr3 = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

		Arrays.sort(arr3);
		for (int i = 0; i < arr3.length / 2; i++) {
			int temp = arr3[i];
			arr3[i] = arr3[arr3.length - 1 - i];
			arr3[arr3.length - 1 - i] = temp;
		}

		System.out.println("Merged and sorted array in descending order:");
		System.out.println(Arrays.toString(arr3));
	}

}
