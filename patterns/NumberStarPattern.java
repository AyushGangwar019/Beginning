package patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        int rows = 2*n-1;
        for(int i=1 ; i<=rows ; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(number++ + "*");
                }
            }
            else{
                int c = number--;
                for(int j=1; j<=rows-i+1;j++){
                    System.out.print(c-n-i+j+1 +"*");
                }
            }
            System.out.println();
        }

    }
}

