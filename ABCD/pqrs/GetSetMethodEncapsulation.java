package pqrs;

public class GetSetMethodEncapsulation {

	private String name;

	public static void main(String[] args) {
		GetSetMethodEncapsulation myObj = new GetSetMethodEncapsulation();
	    myObj.name = "John";  // error
	    System.out.println(myObj.name); // error 
	  }

}
