package day6HW;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in) ;
		
		   int[] array = new int[5];

	        System.out.println("Enter 5 elements:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = ab.nextInt();
	        }

	        Arrays.sort(array);

	        System.out.println("Sorted array in ascending order:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

}
}
