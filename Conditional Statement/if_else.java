import java.util.*;

// if(condition){

// }else{

// }
public class if_else {
    public static void main(String[] args) {

        int n;
        System.out.print("Emter any number :- ");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if (n >= 18) {
            System.out.println("You are eligible for vote ");
        }
        // if (n >= 13 && n <= 17) {
        // System.out.println("You are teenager ");
        // }
        else {
            System.out.println("Not eligible for vote ");

        }
    }
}
