package tryfibonnaci;

import java.util.Scanner;

public class TryFibonnaciIterative {

	public int fibonnaci(int num)
	{
		if(num == 1 || num==2)
			return 1;
		int fib=1,fib1=1,fib2=1;
		for(int i=3;i<=num;i++)
		{
			fib = fib1+fib2;
			fib1=fib2;
			fib2=fib;
		}
		return fib;
		
	}
	
	public static void main(String args[])
	{
		TryFibonnaciIterative fib = new TryFibonnaciIterative();
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println("Fibonnaci Series "+fib.fibonnaci(i));
		}
	}
}
