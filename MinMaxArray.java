package day6HW;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[10];
	        int min, max;

	        System.out.println("Enter 10 numbers:");

	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        min = max = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }

	        System.out.println("Minimum number is: " + min);
	        System.out.println("Maximum number is: " + max);
	}
}
