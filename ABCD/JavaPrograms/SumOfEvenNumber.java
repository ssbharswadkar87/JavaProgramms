package JavaPrograms;

public class SumOfEvenNumber {

	public static void main(String[] args) {

		int n = 100;
		int sum = 0;
		
		for (int i = 2; i <= n ; i = i+2) {
			sum = sum + i ; 
		}
		
		System.out.println("Sum of numbers is => " + sum);
		
		
	}

}
