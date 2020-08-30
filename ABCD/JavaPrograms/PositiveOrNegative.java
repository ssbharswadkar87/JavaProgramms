package JavaPrograms;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {

		Scanner abc = new Scanner(System.in);

		System.out.print("Please provide number ==> ");

		double x = abc.nextDouble();

		if (x > 0.0) {
			System.out.println("Number is positive");
		} else if (x == 0) {
			System.out.println("Number is zero");
		} else {
			System.out.println("Number is negative");
		}

	}

}
