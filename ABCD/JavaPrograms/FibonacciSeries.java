package JavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Fibonacci means third number is sum of last two digits
		// 0 1 1 2 3 5 8 13 21 34 55

		int num = 15;
		int sum = 0;
		int a = 0;
		int b = 1;

		for (int i = 1; i <= num; i++) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
		}

	}

}