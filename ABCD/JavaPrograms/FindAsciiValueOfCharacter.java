package JavaPrograms;

public class FindAsciiValueOfCharacter {

	public static void main(String[] args) {

		char x = 'f';
//		char x = '@';
//		char x = '*';
//		char x = 'A';
//		char x = '7';
		
		int ascii = x;

		System.out.println("ASCII value for given character is ==>" + ascii);

		// we can also you below method
		int acsiiNumber = (int) x;

		System.out.println("ASCII value for given character is ==>" + acsiiNumber);
	}

}
