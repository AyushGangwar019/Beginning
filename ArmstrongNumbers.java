package firstJava;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        for(int i = num1 ; i < num2 ; i++){
            int rem , check , sum = 0;
            check = i;
            while (check != 0){
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check/10;
            }
            if (sum == i){
                System.out.println("Armstrong numbers are :" +i);
            }
        }

    }
}
