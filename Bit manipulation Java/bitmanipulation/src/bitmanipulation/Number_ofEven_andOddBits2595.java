package bitmanipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_ofEven_andOddBits2595 {

	private static ArrayList<Integer>ans(int n){
		int even=0,odd=0;
		boolean flag=true;
		
		while(n>0){
			if(flag) even=even+(n&1);
			else {
				odd=odd+(n&1);
			}
			flag=!flag;
			n=n>>1;
		}
		ArrayList<Integer>aa= new ArrayList<>();
		aa.add(even);
		aa.add(odd);
	return aa; 
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of N :- ");
		int n=sc.nextInt();
		
		System.out.println(ans(n));
	}

}
