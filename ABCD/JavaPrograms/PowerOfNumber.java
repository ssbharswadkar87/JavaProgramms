package JavaPrograms;

public class PowerOfNumber {

	public static void main(String[] args) {
			
		// 3 ^ 3 = 3 * 3 * 3 = 27
		// 2 ^ 4 = 2 * 2 * 2 * 2 = 16
		
		int base = 5;
		int exponent = 0;				
		long value = 1;
		
		// one way
//		while (exponent != 0) {
//			value = value  * base ;
//			
//			--exponent;
//		}
//		
//		System.out.println( base + " to the power of " + exponent + " is equal to ==> " + value);
		
		
		// second way
		
		System.out.println( base + " to the power of " + exponent + " is equal to ==> " + Math.pow(base, exponent));
		
		

	}

}
