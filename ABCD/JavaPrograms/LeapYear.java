package JavaPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

//		To determine whether a year is a leap year, follow these steps:
//
//		1.	If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
//		2.	If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
//		3.	If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
//		4.	The year is a leap year (it has 366 days).
//		5.	The year is not a leap year (it has 365 days).

		Scanner abc = new Scanner(System.in);

		System.out.print("Please enter any year ==>");

		int year = abc.nextInt();

		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				// year is divisible by 400, hence the year is a leap year
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else
				leap = true;
		} else
			leap = false;

		if (leap) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

	}

}
