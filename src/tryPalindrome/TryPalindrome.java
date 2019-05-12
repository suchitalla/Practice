package tryPalindrome;

import java.util.Scanner;

public class TryPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palind = sc.nextLine();
		StringBuilder sbPalind = new StringBuilder(palind);
		StringBuilder revPalind = sbPalind.reverse();
		if(sbPalind.toString().equalsIgnoreCase(revPalind.toString()))
		{
			System.out.println("String : "+ palind +" is palindrome ");
		}
		else
			System.out.println("String : "+ palind +" is not palindrome ");
		
	}

}
