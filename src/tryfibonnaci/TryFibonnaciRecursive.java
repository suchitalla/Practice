package tryfibonnaci;

import java.util.HashMap;
import java.util.Scanner;

public class TryFibonnaciRecursive {
	HashMap<Integer,Integer> cache = new HashMap<>(100);
	
	public int fibonnaci(int num)
	{
		if(num == 1 || num==2)
			return 1;
		return fibonnaci(num-1)+fibonnaci(num-2);
		
	}
	
	public static void main(String args[])
	{
		TryFibonnaciRecursive fib = new TryFibonnaciRecursive();
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println ("Fibonnaci Series");
		for(int i=1;i<=num;i++)
		{
			if(fib.cache.get(i)!=null)
				System.out.println ("Fibonnaci Series "+ fib.cache.get(i));
			else {
				int k=fib.fibonnaci(i);
				System.out.println ("Fibonnaci Series else" + k);
			   fib.cache.put(i,k);
			//System.out.println("Fibonnaci Series "+ k);
			}
		}
	}
}
