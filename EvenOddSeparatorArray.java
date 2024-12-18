package day6HW;

import java.util.Scanner;

public class EvenOddSeparatorArray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[10];
	        int[] evenNumbers = new int[10];
	        int[] oddNumbers = new int[10];
	        int evenCount = 0, oddCount = 0;

	        System.out.println("Enter 10 numbers:");

	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();

	            if (numbers[i] % 2 == 0) {
	                evenNumbers[evenCount] = numbers[i];
	                evenCount++;
	            } else {
	                oddNumbers[oddCount] = numbers[i];
	                oddCount++;
	            }
	        }

	        System.out.println("\nEven numbers:");
	        for (int i = 0; i < evenCount; i++) {
	            System.out.print(evenNumbers[i] + " ");
	        }

	        System.out.println("\nOdd numbers:");
	        for (int i = 0; i < oddCount; i++) {
	            System.out.print(oddNumbers[i] + " ");
	        }
	}
}
