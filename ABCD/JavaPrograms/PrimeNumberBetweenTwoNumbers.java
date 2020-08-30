package JavaPrograms;

public class PrimeNumberBetweenTwoNumbers {

	public static void main(String[] args) {
		
		int low = 30;
		int high = 97;
		
		System.out.println("Prime numbers between " + low + " and " + high + " are ==> " );
		while (low < high) {
			boolean flag = false;
			for (int i =2; i < low/2; i++) {
				if (low % i	 == 0) {
					flag = true;
					break;
				}
			}
			
			
			
			if (flag == false) {
				System.out.println( low + " ");
			}
			low++;
		}

	}

}
