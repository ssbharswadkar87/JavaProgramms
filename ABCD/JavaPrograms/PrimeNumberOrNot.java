package JavaPrograms;

public class PrimeNumberOrNot {

	public static void main(String[] args) {

		// prime number means number is divisible by 1 and given number only like 2, 3 ,
		// 5 ,7, 11, 13, 17

		int num = 29;
		boolean flag = false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				flag = true;
				break;
			}

		}

		if (flag == true) {
			System.out.println(num + " is not a prime number.");
		} else {
			System.out.println(num + " is a prime number");
		}
	}

}
