package JavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 12345; 		// expected output is 54321
		int rev = 0;

		System.out.println("Before reversal number is ==> " + num);
		while (num != 0) {

			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;

		}

		System.out.println("After reversal number is ==> " + rev);

	}

}
