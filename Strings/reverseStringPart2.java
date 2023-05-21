import java.util.Scanner;

class reverseButPositionNotChange{

    String eBPnC(String s){

        String arr[]=s.split(" ");
String sss="";
        for(int i=0;i<arr.length;i++){
         
            for(int j=arr[i].length()-1;j>=0;j--){
          sss+= arr[i].charAt(j);
            }
           sss+=" ";
        }
        return sss;
    }

}

public class reverseStringPart2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();

        reverseButPositionNotChange ss=new reverseButPositionNotChange();
        System.out.println(ss.eBPnC(str));
     }

    
}
