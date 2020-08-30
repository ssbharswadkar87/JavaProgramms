package JavaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {

		// Palindrome means reverse of the number is same
		// Number - 121 reverse of number is 121 which is same so number is palindrom
		// but 123 is not palindrome number

		int num = 1234;
		int rev = 0;
		int actualNumber = num;

		while (num != 0) {

			int temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;

		}

		System.out.println("Reverse of " + actualNumber + " is " + rev);
		
		if (actualNumber == rev) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not palindrome");
		}
	}

}
