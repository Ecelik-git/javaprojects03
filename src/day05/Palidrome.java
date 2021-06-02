package day05;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
//		Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
//		   and checks if sentence is palindrome or not
//		   (without case sensitivity)
//		   Eg : input : I love Java
//		   Output: “Reversed sentence : avaJ evol I .
//		    It is not a palindrome”
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sentence");
		String input= scan.nextLine();
		
		StringBuilder str = new StringBuilder();
		str.append(input);
		
		String reversedInput = str.reverse().toString();
		
		if(input.equalsIgnoreCase(reversedInput)) {
			System.out.println("Reversed sentence :"+reversedInput+" \nThe string is Paindrome");
		}
		else {
			System.out.println("Reversed sentence : "+reversedInput+" \nIt is not a Palindrome");
		}
		scan.close();
		
	}

}
