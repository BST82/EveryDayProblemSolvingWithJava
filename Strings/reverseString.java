import java.util.Scanner;
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
import java.util.stream.Collectors;  

class ReverseStringUsingCollections {
    public static String reverse(String str)  
    {
      // base case: if the string is null or empty
      if (str == null || str.equals("")) {
        return str;
    }

    // create an empty list of characters
    List<Character> list = new ArrayList<Character>();

    // push every character of the given string into it
    for (char c: str.toCharArray()) {
        list.add(c);
    }

    // reverse list using `java.util.Collections` `reverse()`
    Collections.reverse(list);

    // convert `ArrayList` into string and return it
    return list.stream().map(String::valueOf).collect(Collectors.joining());
    
}
}
public class reverseString {


    public static void main(String args[])  
    {  
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter string");
    String s=sc.nextLine();

    ReverseStringUsingCollections  ss=
     new   ReverseStringUsingCollections ();
    
    System.out.println(ss.reverse(s));
    }

}