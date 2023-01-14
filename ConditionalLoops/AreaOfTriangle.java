package ConditionalLoops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        double area ;
        area = (h * b )/2;
        System.out.println("Area of triangle: "+area);
    }
}
