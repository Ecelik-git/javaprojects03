package day05;

import java.util.Scanner;

public class SameCharCheck {

	public static void main(String[] args) {
//		Ask user to type a name, the length of name should be 3.
//		Then check if the name has same characters. 
//		If the String has same characters
//			Print ?String has duplicate characters?
//		Else 
//			Print ?String has unique characters? use ternary
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name that has 3 characters");
		String name = scan.nextLine();
		
		char ch1 = name.charAt(0);
		char ch2 = name.charAt(1);
		char ch3 = name.charAt(2);
		
		String result = name.length()==3 && ch1==ch2 || ch1==ch3 || 
				ch2==ch3?"String has duplicate characters":"String has unique characters";
		
		System.out.println(result);
		scan.close();
		//sameCharCheck();
		
	}
//	public static void sameCharCheck() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a name");
//		List<String> list1 = new ArrayList<>();
//		String name = scan.nextLine();
//		if(name.length()==3) {
//			String arr[]=name.split("");
//			for(String w : arr) {
//				if(!list1.contains(w)) {
//					list1.add(w);
//				}
//			}
//		}
//		String result = list1.size()==3?"String has unique characters":"String has duplicate characters";
//		System.out.println(result);
//		scan.close();
//	}

}
