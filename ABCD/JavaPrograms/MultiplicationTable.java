package JavaPrograms;

public class MultiplicationTable {

	public static void main(String[] args) {

		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6

		int num = 11;

		System.out.println("Multiplication table for " + num + " is as below ==> ");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

}
