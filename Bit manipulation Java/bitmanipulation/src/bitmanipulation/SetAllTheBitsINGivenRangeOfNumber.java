package bitmanipulation;

import java.util.Scanner;

public class SetAllTheBitsINGivenRangeOfNumber {

	private static int setBitInGivenRANGE(int n, int l,int r) {
		
		for(int i=l-1;i<r;i++) {
			n|=(1<<i);
		}
		
		return n;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of N :- ");
		int n=sc.nextInt();
		
		System.out.println("Enter left range :- ");
		int l=sc.nextInt();
		
		System.out.println("Enter right range :- ");
		int r=sc.nextInt();

		System.out.println(setBitInGivenRANGE(n, l, r));
		}

}
