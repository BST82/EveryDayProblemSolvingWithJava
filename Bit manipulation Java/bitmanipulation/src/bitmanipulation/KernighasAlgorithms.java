package bitmanipulation;

import java.util.Scanner;

//Count set bit in a number 
public class KernighasAlgorithms {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to count set bit :- ");
		Integer n= sc.nextInt();
		
		System.out.println(Integer.toBinaryString(n));
		int count=0;
		while(n>0) {
			int rsbm=n & -n;
			n-=rsbm;
			count++;
			
		}
		System.out.println(count);

	}

}
