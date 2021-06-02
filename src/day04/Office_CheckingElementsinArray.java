package day04;

import java.util.Scanner;

public class Office_CheckingElementsinArray {

	public static void main(String[] args) {
//		* Create a method to test if an array contains a specific value
//        * returns true or false
//        *
//        * Then print the result in main method
//        *
//        * input[]= {1,2,3,4,5,6,7} num:6
//        * Output : “Array contains 6”
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int input[]=  {1,2,3,4,5,6,7};
		
		if(checkElement(input, num)) {
			System.out.println("Array contains "+num);
		}else {
			System.out.println("Array doesn't contain "+num);
		}
		scan.close();
	}
	public static boolean checkElement(int[] input, int num) {
		boolean result = false;
		for(int i=0; i<input.length; i++) {
			if(input[i]==num) {
				result = true;
			}
		}
		return result;
	}
}
