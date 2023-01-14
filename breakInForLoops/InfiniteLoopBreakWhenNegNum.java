package breakInForLoops;

import java.util.Scanner;

public class InfiniteLoopBreakWhenNegNum {

	public static void main (String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			int n = sc.nextInt();
			if(n<0) {
				break;
			}
		}
		
	}
}
