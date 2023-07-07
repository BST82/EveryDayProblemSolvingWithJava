package bitmanipulation;

import java.util.Scanner;



public class PowerOfTwo {

	private static Boolean findPowerOf(int n) {
		if(n<=0) return false;
		return (n&n-1)==0;
	}
	
	
	public static void main(String[] args) {
	System.out.println("Enter number ");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();

	
	System.out.println(findPowerOf(n));
	}

}
