package JavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner abc = new Scanner(System.in);

		System.out.print("Please enter first value ==> ");
		int a = abc.nextInt();
		System.out.print("Please enter second number ==> ");
		int b = abc.nextInt();

		System.out.println("Before swapping");
		System.out.println("Value of a is ==> " + a + " and value of b is ==> " + b);

//		//with temp variable
//		int temp = b;
//		b = a;
//		a = temp;
//
//		System.out.println("After swapping");
//		System.out.println("Value of a is ==> " + a + " and value of b is ==> " + b);

		// without temp variale
		a = a - b;
//		System.out.println("a is ==>"  + a);
		b = a + b;
//		System.out.println("b is ==>" + b);
		a = b - a;
//		System.out.println("a is ==>"  + a);

		System.out.println("After swapping");
		System.out.println("Value of a is ==> " + a + " and value of b is ==> " + b);

	}

}
