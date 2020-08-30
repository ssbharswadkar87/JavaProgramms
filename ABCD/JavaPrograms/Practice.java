package JavaPrograms;


public class Practice {

	public static void main(String[] args) {
		
		String input = "Let's meet l8r 2nite";
		
		int strLength = input.length();
		
		for (int i = 0; i < strLength; i++) {
			
			if (!(Character.isAlphabetic(input.charAt(i)))) {
				
				input = input.replace(input.charAt(i), ' ');
				
			}
			
		}
		
		System.out.println(input);
		String[] wordList = input.split("\\s+");
		System.out.println("Total words are ==> " + wordList.length);
		
	}
	
}
