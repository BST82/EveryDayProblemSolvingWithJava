
import java.util.Scanner;

public class Div_By_7{

	public int DivBy_7(String s){
		int res=0;
		for(int i=0;i<s.length();i++) {
			res=res*10+(s.charAt(i)-'0');
			res=res%7;
		}
		if(res==0) {
			return 1;
		}
		return 0;
		
	}
	


	public static void main(String[] args) {
		
		System.out.println("Enter string number ");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();

		Div_By_7 ok = new Div_By_7();
		System.out.println(ok.DivBy_7(s));
	}

}
