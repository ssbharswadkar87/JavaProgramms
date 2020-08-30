package pqrs;

import java.util.Random;

public class ReverseStringByWords {

	public static void main(String[] args) {

		// --------------	Reverse string by Words	----------------------------------------// 

		String b = "Automation learing is necessity now a days";
		
		String[] pap = b.split(" ");
		System.out.println();
		for(int j=pap.length - 1; j >=0; j--) {
			
			System.out.print(pap[j] + " ");
		}
		
		String c = "Automation learing is necessity now a days";
		
		String[] p = c.split("");
		System.out.println();
		for(int k=p.length - 1; k >=0; k--) {
			
			System.out.print(p[k] + " ");
		}
	
		
		//Randon number generation
//		System.out.println("");
//		Random r  = new Random();
//		int i = r.nextInt();
//		System.out.println(i);
	}
	
}


