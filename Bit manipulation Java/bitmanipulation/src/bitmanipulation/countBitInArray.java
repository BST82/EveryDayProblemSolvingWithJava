package bitmanipulation;

import java.util.ArrayList;
import java.util.Scanner;


//leetcode 338. Counting Bits

public class countBitInArray {

//	private static ArrayList<Integer>countInArray(int n){
//		
//		ArrayList<Integer> arr=new ArrayList<>(n+1);
//		
//		int a[]= new int[n+1];
//		
//		for(int i=1;i<=n;i++) {
//			a[i]=a[i/2];
//			if(i%2==1)a[i]++;
//		}
//		
//		for(int i:a) {
//			arr.add(i);
//		}
//		return arr;
//	}
	
	private static int[] countBit(int n) {
		
		int[] ans= new int[n+1];
		
		for(int i=1;i<=n;i++)
			ans[i]=res(i,ans);
		
		return  ans;
	}
	private static int res(int n, int[]memo) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		if(memo[n]!=0) return memo[n];
		
		if(n%2==0) {
			memo[n]=res(n/2,memo);
			return res(n/2,memo);
		}
		else {
			memo[n]=1+res(n/2,memo);
			return 1+res(n/2,memo);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number :- ");
		int n=sc.nextInt();
		
		System.out.println(countBit(n));
	}

}
