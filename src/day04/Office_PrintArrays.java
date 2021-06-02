package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Office_PrintArrays {

	public static void main(String[] args) {
		//  ! Create a static method name: acceptString
		//  It should accept 3 strings as parameter
		//  ! and print them as an array
		//  ! e.g. String[] array = { "sam", "john", "tom" };
		//  ! acceptString(“sam”,”john”,”tom”);
		//  ! Then output: [sam,john,tom]
		//  ! Create another static method name: acceptString2
		//  It should take 3 strings as parameter
		//  ! and print each element in the array
		//  ! e.g. String[] array = { "sam", "john", "tom" };
		//  ! acceptString2(“sam”,”john”,”tom”);
		//  ! Then output: sam john tom
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 strings");
		String a = scan.next().trim();
		String b = scan.next().trim();
		String c = scan.next().trim();
		acceptString(a, b, c);
		acceptString2(a, b, c);
		scan.close();
	}
	public static void acceptString(String a, String b, String c) {
		
		
		String str []= new String[3];
		str[0]=a;
		str[1]=b;
		str[2]=c;
		System.out.println(Arrays.toString(str));
		
	}
	public static void acceptString2(String a, String b, String c) {
		String str []= new String[3];
		str[0]=a;
		str[1]=b;
		str[2]=c;
		
		for (int i=0; i<str.length; i++) {
			System.out.print(str[i] +" ");
		}
	}

}
