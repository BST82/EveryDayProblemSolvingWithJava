import java.io.*;
    import java.util.*;
     

public class License_Key_Formatting {
    
  
      public static String reverseS(String str)
      {
        String nstr = "";
        for (int i = 0; i < str.length(); i++) {
          char ch
            = str.charAt(i); // extracts each character
          nstr
            = ch + nstr; // adds each character in
          // front of the existing string
        }
        return nstr;
      }
     
      // Function to compute the answer
      public static String ReFormatString(String S, int K)
      {
        int len = S.length();
        int cnt = 0;
        int x = 0;
     
        // Move the characters to the
        // back of the string.
        for (int i = len - 1; i >= 0; i--) {
          if (S.charAt(i) == '-') {
            x++;
          }
          else {
            S = S.substring(0, i + x)
              + Character.toUpperCase(S.charAt(i))
              + S.substring(i + x + 1);
          }
        }
     
        // Calculate total number of
        // alphanumeric characters so
        // as to get the number of dashes
        // in the final string.
        int slen = len - x;
        int step = (int)(slen / K);
     
        // Remove x characters from the
        // start of the string
     
        S = reverseS(S);
        int val = x;
        while (val > 0) {
          S = S.substring(0, S.length() - 1);
          val--;
        }
     
        // Push the empty spaces in
        // the string (slen+step) to get
        // the final string length
     
        int temp = step;
        while (temp > 0) {
          S += " ";
          temp--;
        }
        S = reverseS(S);
     
        len = S.length();
     
        // Using simple mathematics
        // to push the elements
        // in the string at the correct place.
     
        int i = slen, j = step, f = 0;
        while (j < len) {
     
          // At every step calculate the
          // number of dashes that would be
          // present before the character
          step = (int)(i / K);
          if (f == 1)
            step--;
          int rem = i % K;
     
          // If the remainder is zero it
          // implies that the character is a dash.
     
          if (rem == 0 && f == 0) {
            S = S.substring(0, j - step) + "-"
              + S.substring(j - step + 1);
            f = 1;
            continue;
          }
          S = S.substring(0, j - step) + S.charAt(j)
            + S.substring(j - step + 1);
          i--;
          j++;
          f = 0;
        }
        // Remove all the dashes that would have
        // accumulated in the beginning of the string.
     
        len = S.length();
        S = reverseS(S);
        for (int m = len - 1; m >= 0; m--) {
          if (S.charAt(m) != '-') {
            break;
          }
          if (S.charAt(m) == '-')
            S = S.substring(0, S.length() - 1);
        }
        S = reverseS(S);
     
        return S;
      }
     
      public static void main(String[] args)
      {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int K = sc.nextInt();
     
        // Function Call
        System.out.println(ReFormatString(s, K));
      }
}





