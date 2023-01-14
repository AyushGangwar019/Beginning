package breakInForLoops;

import java.util.Scanner;

public class OneToHundredBreakAtGivenInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	
		
		for (int i = 1 ; i <=100 ; i++) {
			
			if(i==101) {
				break;
			}
		
		
		System.out.println(i);
		}
	}

}
