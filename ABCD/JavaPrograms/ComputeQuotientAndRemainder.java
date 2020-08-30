package JavaPrograms;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {

	public static void main(String[] args) {

		Scanner abc = new Scanner(System.in);
		
		System.out.print("Please provide first number ==> ");
		int dividend = abc.nextInt();
		
		System.out.print("Please provid second number ==> ");
		int divisor = abc.nextInt();
		
		int quotient = dividend / divisor;		
		
		int remainder = dividend % divisor;
		
		System.out.println("Quotent is ==> " + quotient);
		System.out.println("Remainder is ==>" + remainder);

		//30 devided 5 then quotient is 6 and remainder is zero as if we devide 30 by 5 then its 6 and remaining value is zero
		//32 devided 5 then quotient is 6 and remainder is 2 as if we devide 30 by 5 then its 6 and remaining value is 2
		
	}

}
