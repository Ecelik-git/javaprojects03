package day06;

import java.util.Scanner;

public class ReversedPyramid {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<num-i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}

}
