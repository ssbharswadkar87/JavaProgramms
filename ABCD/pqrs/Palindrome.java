package pqrs;

public class Palindrome {

	public static void main(String[] args) {
		
		
//Palindrome means a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam, dad, mom

		String S1 = "madam";
		StringBuilder sb = new StringBuilder(S1);
		StringBuilder temp = sb.reverse();
		String S2 = temp.toString();
		if (S1.equalsIgnoreCase(S2)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
		
	
	}

}
