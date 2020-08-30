package JavaPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner abc = new Scanner(System.in);

		System.out.print("Please enter a number ==> ");

		int a = abc.nextInt();

		if (a % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

}
