package tryPrime;

import java.util.Scanner;

public class TryPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 1;
		
		while (number != 0)
		{
			number = sc.nextInt();
			boolean x =isPrime(number);
			System.out.println("Number :"+ number + "is Prime : "+ x);
		}
	}

	public static boolean isPrime(int num)
	{
		if(num == 2 || num == 3)
			return true;
		if(num%2==0)
			return false;
		for (int i=3;i<(Math.sqrt(num)+1);i+=2) {
			if( num%i == 0)
			 return false;
		}
			
		return true;
					
	}
}
