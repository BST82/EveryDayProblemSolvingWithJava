package bitmanipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class FindNumbersWithEvenNumberOfDIgits_1295 {

	
	private static int ans(ArrayList<Integer>arr){
		
		int count=0;
		
		for(int i:arr) {
			count+=(int)Math.log10(i)&1;
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.println("Enter size of array :- ");
		
		n=sc.nextInt();
		System.out.println("Enter array elements :- ");
		
		ArrayList<Integer>arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		
	System.out.println(ans(arr));

	}

}
