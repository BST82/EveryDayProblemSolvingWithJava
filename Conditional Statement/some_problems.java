import java.util.*;

public class some_problems {
    public static void main(String[] args) {
        System.out.println("print the largest of 2 :- ");

        int A;
        int B;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        if (A > B) {
            System.out.println(A + " is greater than " + B);
        } else {
            System.out.println(B + " is greater than " + A);
        }

        System.out.println(even(A));
    }

    public static String even(int A) {
        if ((A % 10 == 1) || (A % 10 == 3) || (A % 10 == 5) || (A % 10 == 7) || (A % 10 == 9)) {
            return "A is Odd ";
        }
        return "A is Even ";

    }
}
