package JavaPrograms;

public class AlphabetOrNot {

	public static void main(String[] args) {

		char ch = 'd';

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " is character");
		} else {
			System.out.println(ch + " is not character");
		}

	}

}
