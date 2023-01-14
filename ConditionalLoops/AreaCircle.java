package ConditionalLoops;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.14, area;
        area = ( r * r ) * pi ;
        System.out.println("Area of circle is : "+area);

    }
}
