package bitmanipulation;

import java.util.Scanner;

public class FindPositionOfSetBit {

	
    static boolean isPowerOfTwo(int n)
    {
        return (n > 0 && ((n & (n - 1)) == 0)) ? true : false;
    }

    // Returns position of the only set bit in 'n'
    static int findPosition(int n)
    {
        if (!isPowerOfTwo(n))
            return -1;

        int i = 1, pos = 1;

        // Iterate through bits of n till we find a set bit
        // i&n will be non-zero only when 'i' and 'n' have a set bit
        // at same position
        while ((i & n) == 0) {
            // Unset current bit and set the next bit in 'i'
            i = i << 1;

            // increment position
            ++pos;
        }

        return pos;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 16;
        int pos = findPosition(n);
        if (pos == -1)
            System.out.println("n = " + n + ", Invalid number");
        else
            System.out.println("n = " + n + ", Position " + pos);

        n = 12;
        pos = findPosition(n);
        if (pos == -1)
            System.out.println("n = " + n + ", Invalid number");
        else
            System.out.println("n = " + n + ", Position " + pos);

        n = 128;
        pos = findPosition(n);
        if (pos == -1)
            System.out.println("n = " + n + ", Invalid number");
        else
            System.out.println("n = " + n + ", Position " + pos);
    }

}
