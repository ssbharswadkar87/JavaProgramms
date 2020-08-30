package JavaPrograms;

public class FactorialNumber {

	public static void main(String[] args) {

		// factorial means !5 = 5 * 4 * 3 * 2 * 1 = 120
		// factorial means !8 = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 40,320
		// factorial means !0 = 1
		int num = 6;
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}

		System.out.println("Factorial value of " + num + " is ==> " + fact);

	}

}
