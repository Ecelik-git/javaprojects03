package day04practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nameCheck {

	public static void main(String[] args) {
//		Ask user to type a name, the length of name should be 3.
//		Then check if the name has same characters.
//		If the String has same characters
//			Print “String has duplicate characters”
//		Else
//			Print “String has unique characters”
//			
//			Use ternary
		name1Check();
	}
	public static void name1Check() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		List<String> list1 = new ArrayList<>();
		String name = scan.nextLine();
		if(name.length()==3) {
			String arr[]=name.split("");
			for(String w : arr) {
				if(!list1.contains(w)) {
					list1.add(w);
				}
			}
		}
		String result = list1.size()==3?"String has unique characters":"String has duplicate characters";
		System.out.println(result);
		scan.close();
	}
	

}
