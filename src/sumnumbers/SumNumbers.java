package sumnumbers;


import java.util.HashSet;

public class SumNumbers {

	public static void main(String[] args) {
		int a[]= {0,1,2,3,4,-2,-6,9,10};
		int num= 4;
		HashSet<Integer> checkedVals = new HashSet<>();
	for(int i=0;i<a.length;i++)
	{
		int x = num-a[i];
		checkedVals.add(x);
	}
		for(int i=0;i<a.length;i++)
		{
			if(checkedVals.contains(a[i]))
			{
				System.out.println("Match found " + a[i] +" and "+ (num-a[i]));
			}
		}

	}

}
