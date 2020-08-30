package JavaPrograms;

import java.util.Scanner;

public class AddTwoIntergers {

	public static void main(String[] args) {
		
		Scanner abc = new Scanner(System.in);
		
		System.out.print("Please enter first number ==>");
		
		int a = abc.nextInt();
		
		System.out.print("Please enter second number ==>");
		int b = abc.nextInt();
		
		int c = a+b;
		
		System.out.println("Addition of given two numbers is ==>" + c);
		

	}

}
