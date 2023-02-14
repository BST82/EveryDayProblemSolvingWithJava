package Basic_Problem;

import java.util.Scanner;

public class sum_using_userInput {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();
        int sum = number_1 + number_2;

        System.out.println(sum);

    }
}
