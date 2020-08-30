package JavaPrograms;

public class VowelOrConsonant {

	public static void main(String[] args) {

		// a e i o u are vowels

		char ch = 'g';

	// first way		
//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//				|| ch == 'O' || ch == 'U') {
//			System.out.println("character is vowel");
//		} else {
//			System.out.println("character is consonant");
//		}

	//second way
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("character is vowel");
			break;

		default:
			System.out.println("character is consonant");
			break;
		}
		
	}

}
