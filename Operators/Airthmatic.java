package Operators;

import java.util.*;
// Binary operator
// (+) => a+b => 10+5 => 15
// (-) => a-b =>10-5 =>5
// (*) => a*b =>10*5 =>50
// (/) => a/b =>10/5 =>2(Quotient)
// (%) => %*b =>15%*2 =>1(remender)

// eg:-

public class Airthmatic {

    public static void main(String[] args) {

        /*
         * int A;
         * int B;
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Enter number first ");
         * A = sc.nextInt();
         * System.out.print("Enter number second ");
         * B = sc.nextInt();
         * System.out.print("Sum of two Numbers ");
         * System.out.println(A + B);
         * 
         * System.out.print("Substraction of two Numbers ");
         * System.out.println(A - B);
         * 
         * System.out.print("Multiply of two Numbers ");
         * System.out.println(A * B);
         * 
         * System.out.print("Remender of two Numbers ");
         * System.out.println(A % B);
         * 
         * System.out.print("Quotient of two Numbers ");
         * System.out.println(A / B);
         * 
         */

        // unary operator
        // ++ , --

        int num1 = 7;
        int num2 = 10;

        // preIncrement
        // ++a
        ++num1;
        System.out.println(" value will change first before print (pre increment) :-" + num1);
        // post operator
        // a++
        System.out.println(" value will print first than Increment (post increment) :-" + num2);
        num2++;

    }
}
