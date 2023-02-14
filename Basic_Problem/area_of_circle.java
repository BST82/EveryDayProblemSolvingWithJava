package Basic_Problem;

import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float redious = sc.nextFloat();
        float area_of_circle = 3.14f * (redious * redious);

        System.out.println(area_of_circle);
    }
}
