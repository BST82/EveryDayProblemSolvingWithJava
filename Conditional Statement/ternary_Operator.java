// Ternary Operator (3 operands)

// variable = condition ? statement_1 : statement_2

// another way to write if else statements 

public class ternary_Operator {
    public static void main(String[] args) {
        System.out.println(ternary_sum(21));
        System.out.println(ternary_sum(28));
        System.out.println(ternary_sum(9));
    }

    public static String ternary_sum(int A) {
        String result = (A % 2 == 0) ? "Even " : "Odd";
        return result;
    }
}
