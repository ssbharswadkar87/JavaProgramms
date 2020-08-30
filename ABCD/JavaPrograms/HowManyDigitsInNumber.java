package JavaPrograms;

public class HowManyDigitsInNumber {

	public static void main(String[] args) {

		// 12345 = 5
		// 9645634 = 7

		int num = 1345;
		int count = 0;

		while (num != 0) {

			num = num / 10; 		// 1234567
			++count; 				// 1
		}

		System.out.println("Number of digits in given numbers are ==> " + count);

	}

}
