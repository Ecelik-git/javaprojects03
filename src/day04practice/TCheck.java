package day04practice;

import java.util.Scanner;

public class TCheck {

	public static void main(String[] args) {
//		StringMethods
//	       Write a Java program to read a string and if the first or last characters are 't',
//	        return the string without those 't' otherwise return the string unchanged.
//	        Example:
//	        INPUT      : The given strings is: testcricket
//	         OUTPUT :  The new string is: estcricke
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str= scan.nextLine().toLowerCase().trim();
		
		if(str.charAt(0)=='t' && str.charAt(0)==str.charAt(str.length()-1)) {
			
			str=str.substring(1, str.length()-1);
		}else if(str.charAt(0)=='t') {
			str=str.substring(1, str.length());
		}
		System.out.println(str);
		scan.close();
	}

}
