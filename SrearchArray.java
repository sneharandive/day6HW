package day6HW;

import java.util.Scanner;

public class SrearchArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		int array1[]=new int[size];
		System.out.print("Enter"+size+"elements:");
		
		for(int i=0;i<size;i++) {
			array1[i] = sc.nextInt();
		}
		System.out.print("Enter the element to search:");
		int searchElement=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<size;i++) {
			if(array1[i]==searchElement) {
				found=true;
				System.out.println("Element"+searchElement+"found at index:"+i);
				break;
			}
		}
		if(!found) {
			System.out.println("Element"+searchElement+"not found in the array.");
		}
	}

}
