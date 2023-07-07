package bitmanipulation;

import java.util.Scanner;

public class CheckRightMostBit {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		
		Integer n = sc.nextInt();
		
		System.out.println(Integer.toBinaryString(n));
		
		Integer ans= n & -n;
		
		System.out.println(Integer.toBinaryString(ans));
		
	}

}
