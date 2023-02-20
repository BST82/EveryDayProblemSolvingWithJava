package Operators;

public class Assignment_operator {
    public static void main(String[] args) {
        /*
         * 1) = (assignment) a=b (b's value is assigning to a)
         * 
         * 2) +=
         * 3) -=
         * 4) *=
         * 5) /=
         * 6) %=
         */

        int A;
        int B = 10;
        A = B;
        int C = 20;
        C += 20; // c+=20 expression is fast than c=c+20;
        System.out.println(A);
        System.out.println(C);
        int D = 20;
        D %= 3; // D=D%3;
        System.out.println(D);

        int F = 40;
        F /= 5; // F=F/5
        System.out.println(F);

    }

}
