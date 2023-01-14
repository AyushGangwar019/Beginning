package ConditionalLoops;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int hypo = sc.nextInt();
        double h = Math.sqrt((hypo * hypo) - ((b*b)/4));
        double area = (b*h)/2;
        System.out.println("Area of Isosceles Triangle is : " +area);
    }
}
