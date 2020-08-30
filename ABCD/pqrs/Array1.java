package pqrs;

public class Array1 {

	public static void main(String[] args) {

		int a[] = {2, 4, 6, 8, 10, 12, 14, 16};
		
		System.out.println(a.length);
//		
//		for (int i=0; i< a.length; i++) {
//			
//			if(a[i]==6) {
//				System.out.println(a[i]);
//			}
//			
//		}

		//print second last number
		
		int b = a[a.length-3];
		
		System.out.println(b);
		
	}

}
