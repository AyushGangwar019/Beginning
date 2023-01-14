package ConditionalLoops;

import java.util.Scanner;

public class SubtractSumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff ,product , sum ;
        product = a *b;
        sum = a+b;
        diff = product - sum;
        System.out.println("Difference of product and sum is : "+diff);
    }
}
