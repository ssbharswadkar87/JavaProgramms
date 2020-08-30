package pqrs;

public class SplitString {

	public static void main(String[] args) {

		//split with space
		
//		String s = "I want to walk my dog";
//		String[] arr = s.split(" ");    
//		// OR String[] arr = s.split("\\s");
//		for ( String ss : arr) {
//		    System.out.println(ss);
//		}
//
//		System.out.println("=========================================================");
//		
//		String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
//		    String[] arrSplit = strMain.split(", ");
//		    for (int i=0; i < arrSplit.length; i++)
//		    {
//		      System.out.println(arrSplit[i]);
//		    }
		
		//Java String split() method with regex and length
		
//		    String strMain1 = "Alpha, Beta, Delta, Gamma, Sigma";
//		    String[] arrSplit1 = strMain1.split(", ", 4);
//		    for (int i=0; i < arrSplit1.length; i++)
//		    {
//		      System.out.println(arrSplit1[i]);
//		    }
	
		    String s = "abcd";
		    char[] a = s.toCharArray();
		    for (char b:a) {
		    	System.out.println(b);
		    }
		    
	}  

}
