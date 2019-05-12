package duplicateremove;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String args[]) {
		
		int a[]= {1,2,3,4,5,6,3,4,9,7,7,9};
		HashSet<Integer> remDup = new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			if(remDup.contains(a[i]))
			{
				System.out.println("Duplicate found ="+a[i]);
			}
			remDup.add(a[i]);
		}
		
	}
}
