package ConditionalLoops;

import java.util.Scanner;

public class ElectricityBills {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int unit  = in.nextInt();
            double billToPay = 0;
            if (unit <= 100){
                billToPay = unit * 10;
                System.out.println("The bill of units "+unit+" is "+billToPay);
            }
            else if(unit <= 200 && unit >= 100){
                billToPay = 100*10 + (unit-100)*20;
                System.out.println("The bill of units "+unit+" is "+billToPay);
            }
            else if(unit <= 300 && unit >= 200 ){
                billToPay = 100*10 + 100 *15 + (unit-200) *20;
                System.out.println("The bill of units "+unit+" is "+billToPay);
            }
            else{
                billToPay = 100*10 + 100 *15 + 100*20 +(unit-300)*25;
                System.out.println("The bill of units "+unit+" is "+billToPay);
            }

        }
}
