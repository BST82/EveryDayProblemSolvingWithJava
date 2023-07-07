package bitmanipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class GrayCode {

	private static ArrayList<String>solution(int n){
		
		//base case
		if(n==1) {
			ArrayList<String> base=new ArrayList<>();
			base.add("0");
			base.add("1");
			
			return base;
		}
		
		ArrayList<String>res=solution(n-1);
		ArrayList<String>ans= new ArrayList<>();
		for(int i=0;i<res.size();i++) {
			String str=res.get(i);
			ans.add("0"+str);
		}
		for(int i=res.size()-1; i>=0;i--) {
			String str=res.get(i);
			ans.add("1"+str);
		}
		return ans;
	}
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		
		ArrayList<String>arr=solution(n);
		for(String str:arr) {
			for(int i=0;i<str.length();i++) {
				System.out.print(str.charAt(i)+" ");
			}
			System.out.println();
		}
	}

}
