package Operators;

public class logical_operator {
    public static void main(String[] args) {
        /*
         * 1) && (AND) a>b && a>c (both condition must be true)
         * 
         * 2) || (pipe operator)(OR) a>b || a>c (any one condition will satisfied it
         * will return true)
         * 
         * 3) ! (Logical NOT) (not operator(exclamation mark) ) ~(true)= false
         * ~ false = true
         */

        int A = 10;
        int B = 20;
        int C = 5;

        // 1) && (AND) a>b && a>c (both condition must be true)
        System.out.println("Both are true :- " + (B > A && C < A));

        // 2) || (pipe operator)(OR) a>b || a>c (any one condition will satisfied it
        // will return true)
        System.out.println("any of one could be true :- " + (B > A || C > A));

        boolean X = true;
        System.out.println("Not true X :- " + !X);

        boolean Y = false;
        System.out.println("Not false Y :- " + !Y);

    }
}
