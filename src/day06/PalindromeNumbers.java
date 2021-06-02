package day06;



public class PalindromeNumbers {
//	A palindromic number reads the same both ways.
//    * The largest palindrome made from the product of two 2-digit numbers is
//    *   9009 = 91 × 99.
//    * Find the largest palindrome made from the product of two 3-digit numbers.
//    * like 654*671 = 438834

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNumber = 1;
		int biggestMultiplier1 = 1;
		int biggestMultiplier2 = 1;
		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				if(isPalindrome(i*j)) {
					if(maxNumber<i*j) {
						maxNumber=i*j;
						biggestMultiplier1=i;
						biggestMultiplier2=j;
					}
				}
			}
		}
		System.out.println("Maximum Palindrome number: "+maxNumber+"="+biggestMultiplier1+"*"+biggestMultiplier2);
		
	}
	
	private static boolean isPalindrome(int number) {
		boolean result=false;
		int temp=number;
		
		int digit1=temp%10;
		temp=temp/10; //temp/=10;
		
		int digit2=temp%10;
		temp=temp/10;
		
		int digit3=temp%10;
		temp=temp/10;
		
		int digit4=temp%10;
		temp=temp/10;
		
		int digit5=temp%10;
		temp=temp/10;
		
		int digit6=temp%10;
		temp=temp/10;
		
		if(digit1==digit6 && digit2==digit5 && digit3==digit4) {
			result = true;
		}
		
		return result;
	}

}
