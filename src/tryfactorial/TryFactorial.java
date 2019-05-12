package tryfactorial;

import java.util.Scanner;

public class TryFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorialnum = factorial(num);
		int factorialnum2 = factorialIter(num);
		System.out.println("factorial recursive" + factorialnum);
		System.out.println("factorial iterative" + factorialnum2);
	}

	public static int factorial(int num)
	{
		if(num == 0)
			return 1;
				
		return num*factorial(num-1);
	}
	
	public static int factorialIter(int num)
	{
		int fac=1;
		while(num != 0)
		{
			fac = fac* num ;
			num--;
		}
		return fac;
	}
}
