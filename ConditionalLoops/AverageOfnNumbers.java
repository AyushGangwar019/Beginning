package ConditionalLoops;

import java.util.Scanner;

public class AverageOfnNumbers {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter?");
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        double[] arr = new double[count];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter input number " + (i + 1) + ": ");
            arr[i] = in.nextDouble();
        }
        in.close();

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }


        double average = sum / count;

        System.out.format("The average is: %.2f", average);
    }
}