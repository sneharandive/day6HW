package day6HW;

import java.util.Scanner;

public class ArrayMergerArray {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the first array: ");
	        int size1 = scanner.nextInt();
	        System.out.print("Enter the size of the second array: ");
	        int size2 = scanner.nextInt();

	        int[] array1 = new int[size1];
	        int[] array2 = new int[size2];
	        int[] mergedArray = new int[size1 + size2];

	        System.out.println("Enter elements of the first array:");
	        for (int i = 0; i < size1; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array1[i] = scanner.nextInt();
	        }

	        System.out.println("Enter elements of the second array:");
	        for (int i = 0; i < size2; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array2[i] = scanner.nextInt();
	        }
	        for (int i = 0; i < size1; i++) {
	            mergedArray[i] = array1[i];
	        }
	        for (int i = 0; i < size2; i++) {
	            mergedArray[size1 + i] = array2[i];
	        }

	        System.out.println("Merged Array:");
	        for (int i = 0; i < mergedArray.length; i++) {
	            System.out.print(mergedArray[i] + " ");
	        }
}
}
