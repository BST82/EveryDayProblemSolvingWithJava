package bitmanipulation;

import java.util.Scanner;

public class JosephusProblem {


	private static int powerOf2(int n) {
		int i=1;
		while(i*2<=n) {
			i*=2;
		}
		return i;
	}
	
	private static int josephus(int n) {
		int ans=powerOf2(n);
		int l= n-ans;
		
		return (2*l)+1;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers :- ");
		int n= sc.nextInt();
		
		System.out.println(JosephusProblem.powerOf2(n));
		System.out.println("Last alive number is "+josephus(n));
	
	}

}
