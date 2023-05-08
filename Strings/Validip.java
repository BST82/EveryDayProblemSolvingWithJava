import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Solution{
    int isValid(String s) {
    
        int counter=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
             counter++;
            }
        }
        if(counter!=3) return 0;

        Set<String> set = new HashSet<String>();
        
        for(int i=0;i<256;i++){
       
           set.add(Integer.toString(i));
        }
        counter=0;
      
        String temp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.'){
            temp=temp+s.charAt(i);
            }else{
                    if(set.contains(temp))
                    counter++;
                    temp="";
            }
        }
        if(set.contains(temp))
                    counter++;

        if(counter==4) return 1;

      return 0;

            
        }

}
public class Validip {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
         
        Solution sol= new Solution();

        System.out.println(sol.isValid(s));

    }
}