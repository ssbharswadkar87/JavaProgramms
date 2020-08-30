package JavaPrograms;

import java.util.Scanner;

public class MultiplyTwoFloatingNumbers {

	public static void main(String[] args) {

		Scanner abc = new Scanner(System.in);
		
		System.out.print("Pleaes enter first floating number==> ");
		float f1 = abc.nextFloat();
		
		System.out.print("Please enter second floating number==> ");
		float f2 = abc.nextFloat();
		
		float f3 = f1*f2;
		
		System.out.println("Multiplication of two floating numbers is ==> " + f3);

	}

}
