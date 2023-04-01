
import java.util.HashMap;
import java.util.Scanner;

public class Roman_to_Integer {

	public static void main(String[] args) {
		
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		HashMap<Character,Integer> map = new HashMap<>();
		map.put('I',1);
		map.put('V',5);
		map.put('C',100);
		map.put('D',500);
		map.put('L',50);
		map.put('M',1000);
		map.put('X',10);
	
		int ans=0;
	for(int i=0;i<s.length();i++) {
		int first=map.get(s.charAt(i));
	
		if(i+1<s.length()) {
			int second=map.get(s.charAt(i+1));
			if(first<second) {
				ans+=(second-first);
				i++;
			}else {
				ans+=first;
			}
		}else {
			//only for first element
			ans+=first;
		}
	}

	System.out.println(ans);
}
}