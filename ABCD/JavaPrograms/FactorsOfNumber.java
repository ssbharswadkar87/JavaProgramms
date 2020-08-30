package JavaPrograms;

public class FactorsOfNumber {

	public static void main(String[] args) {

		// factors means given number is divisible by which numbers
		// 4 = 1, 2, 4
		// 60 = 1, 2, 3, 4, 5 , 6, 10, 12, 15, 20, 30, 60

		int num = 60;
		int actualNum = num;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				System.out.println(i);
			}

		}

	}

}
