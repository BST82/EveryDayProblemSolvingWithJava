package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class HeighestFrequencyCharcter {
    
    public char countFrequencyCharacter(String s){
     
       
       HashMap<Character,Integer> ans= new HashMap<>();
       for(int i=0;i<s.length();i++){
       char ch=s.charAt(i);
       if(ans.containsKey(ch)){
          int of=ans.get(ch);
          int nf=of+1;
          ans.put(ch,nf);
       }else{
        ans.put(ch,1);
       }
       }
   

       //1st position key assign to maxFrequencyCharacter
       char maxFrequencyCharacter=s.charAt(0);
       //loop on keys 
      for(Character key:ans.keySet()){
     if(ans.get(key)>ans.get(maxFrequencyCharacter)){
        maxFrequencyCharacter=key;
     }
      }
      return maxFrequencyCharacter;
    }
   
    public static void main(String[] args){

        System.out.println("Enter string");
        Scanner sc= new Scanner(System.in);
        String s= sc.next();

        HeighestFrequencyCharcter ans= new HeighestFrequencyCharcter();
        System.out.println(ans.countFrequencyCharacter(s));
    }
}
