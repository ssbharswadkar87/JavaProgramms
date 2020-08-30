package JavaPrograms;

import java.util.Scanner;

public class PrintIntegerEnteredByUser {

	public static void main(String[] args) {


		//print integer entered by user	
		
		Scanner abc = new Scanner(System.in);
		System.out.print("Please enter number==>");
		
		int x = abc.nextInt();
		
		System.out.println("you entered number==>" + x);
		

	}

}
