package containsnum;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsNum {

	public static void main(String[] args) {
		int a[]= {1,2,3,9,10,4,5,6};
		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		
		int isPresent = Arrays.binarySearch(a, num);
		System.out.println("isPresent ="+isPresent);
		if(isPresent>=0)
		System.out.println(isPresent);
		else
			System.out.println("Not Present");
		
		int maxnum,minnum;
		
		Arrays.sort(a);
		 minnum=a[0];
		 maxnum=a[a.length-1];
		
		System.out.println("minnum ="+minnum+" maxnum = "+maxnum);
	}

}
