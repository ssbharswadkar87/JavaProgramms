package JavaPrograms;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {

		Scanner abc = new Scanner(System.in);
		
		System.out.print("Please enter first number ==> ");
		double a = abc.nextInt();

		System.out.print("Please enter second number ==> ");
		double b = abc.nextInt();

		System.out.print("Please enter an operation you want to perform (+ , -, *, /) ==> ");

		char operator = abc.next().charAt(0);

		double result = 0;

		switch (operator) {

		case '+':
			result = a + b;
			break;

		case '-':
			result = a - b;
			break;

		case '*':
			result = a * b;
			break;

		case '/':
			result = a / b;
			break;

		default:
			System.out.println("Please provide correct operrator");

		}

		System.out.println("output is ==> " + result);
	}

}
