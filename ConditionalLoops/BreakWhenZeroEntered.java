package ConditionalLoops;

import java.util.Scanner;

public class BreakWhenZeroEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = n ; n != 0; i ++ ){
            sum = sum + n;

        }
        System.out.println(sum);
    }
}