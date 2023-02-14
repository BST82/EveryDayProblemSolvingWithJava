package Basic_Problem;

public class type_Promotion {
    public static void main(String[] args) {

        /*
         * java automatically promotes byte,short,or char
         * operand to integer when evaluating an expression
         * 
         * 2) Type promotion only accure with expressions
         * such as airthmetic expressions and ETC
         * 
         */
        // example

        char a = 'a'; // 97
        char b = 'b'; // 99
        System.out.println(b - a);

        /*
         * * 3) If one operand is long ,float , or double the whole
         * expression is promoted to long ,float, or double respectively
         * 
         */

        // example

        int x = 10;
        float y = 22.22f;
        long z = 34;
        double w = 50;
        double sum = x + y + z + w; // rhs is also converted in double
        System.out.println(sum);
        // int lossy_con=x + y + z + w; // it will show error

        // Type promotion in expressions

        // wrong
        /*
         * byte b= 5;
         * b=b*2; // now it will act as integer
         */

        // right
        /*
         * 
         * byte b=5;
         * b=(byte)(b*2) // now it is byte
         */

    }
}
