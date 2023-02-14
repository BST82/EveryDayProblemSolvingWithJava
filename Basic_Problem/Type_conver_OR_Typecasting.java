package Basic_Problem;

import java.util.*;

public class Type_conver_OR_Typecasting {
    public static void main(String[] args) {

        // type conversion is those conversion which autometacly performed by java
        /*
         * known as Wide conversion or implicit conversion
         * conversion happens when
         * A) type compatible
         * B) dstination type > source type;
         * eg) byte->short->int->float->long->double
         */
        int a = 10;
        long b = a;
        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt(); // this is Wide conversion where we are converting integer to float

        System.out.println(num);

        // Lossy conversion (Type casting) or Narrowing conversion or explicit
        // conversion
        /*
         * where,
         * 1) source type>destination type
         * 2) we forcefully convert lower type to Large Type
         */

        System.out.println("Lossy Conversion (Type Casting)");

        float any_num = 22.4f;
        int any_int = (int) any_num;
        System.out.println(any_int);

        // Type conversion in characters
        System.out.println("Type conversion in characters ");

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}
