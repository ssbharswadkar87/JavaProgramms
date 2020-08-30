package JavaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		// 371 = 3*3*3 + 7*7*7 + 1*1*1 = 27+343+1 = 371

		int num = 371;
		int actualNum = num;
		double result = 0;

		while (actualNum != 0) {
			int n = actualNum % 10;
			result = result + Math.pow(n, 3);
			actualNum = actualNum / 10;
		}

		if (result == num) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

	}

}
