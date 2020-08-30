package pqrs;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n =12345; 
		int rev	=0;
		
		while(n!=0){
			int r = n%10;
			n = n/10;
			rev = rev*10+r;
		}
		System.out.println("Reversed = "+rev);  

	}

}


