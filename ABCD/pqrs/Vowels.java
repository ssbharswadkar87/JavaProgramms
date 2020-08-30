package pqrs;

public class Vowels {

	public static void main(String[] args) {

		//-------------- Check Number of Vowels in String  -------------------------------//
		String s = "Automation learing is necessity now a days";
	
		char[] letters = s.toCharArray();
		int count = 0;
		for(char c : letters){
			switch(c){
				case 'a' :
				case 'e' :
				case 'i' :
				case 'o' :
				case 'u' :
					count++;
					break;
					default:
			}
		}
		System.out.println("Total Vowels in String = "+count);
	}

}
