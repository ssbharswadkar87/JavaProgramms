package pqrs;

import java.util.Arrays;

public class GreaterNumber {

	public static void main(String[] args) {

		//-------------- Find 1st & 2nd Greater Number from Array  -----------------------//
//		int[] a = {1,2,3,4,5,6,7,8,9};
//		int g1=0;
//		int g2=0;
//		
//		for(int i=0;i<a.length;i++){
//			if(a[i]>g1){
//				g2=g1;
//				g1=a[i];
//			}
//		}
//		System.out.println("first highest number is ==> "+g1);
//		System.out.println("second highest number is ==> "+g2);
		
		
//		//-------------- 15 -  Find Duplicate Number in Array  ---------------------------------
		int[] a = {4,5,6,7,8,9,9};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			int n = a[i];
			int counter =0;
			for(int j=0;j<a.length;j++){
				if(n==a[j])
					counter++;
			}
			if(counter>1){
				System.out.println("Duplicate Number = "+a[i]);
				break;
			}
		}
		
	
}
		
	}


