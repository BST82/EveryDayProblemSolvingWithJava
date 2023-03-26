import java.util.Scanner;
import java.util.*;  

class Longest_Common_Prefix_in_an_Array{

   public static String lCp(String arr[]){
   String ans = arr[0];
        for(int index=1;index<arr.length;index++){
            while(arr[index].indexOf(ans) != 0){
                ans=ans.substring(0,ans.length());
            }
        }
        return ans;
 
   }

    public static void main(String[] args){
        System.out.print("Enter size of string array:- ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();

 System.out.print("Enter elements in  string array:- ");
 String arr[]=new String[size];
 Scanner s1 = new Scanner(System.in);
 for(int i=0;i<arr.length;i++){
    arr[i]=s1.nextLine();
    
 }

//  for(int i=0;i<arr.length;i++){
//      System.out.print(arr[i]+" ");
//  }

System.out.print(lCp(arr));
        
    }
}