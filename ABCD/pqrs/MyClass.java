package pqrs;

public class MyClass {

	// Static Method
	
	static void myStaticMethod() {
		System.out.println("Static Methods can be called without creating objects.");
	}
	
	// Public Method
	
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating Objects.");
	}
	
	// Main Method
	
	public static void main(String[] args) {
	
		myStaticMethod();
		// myPulicMethod will give error. we have to create object
		
		MyClass myObj = new MyClass();
		myObj.myPublicMethod();
		
		
	}

}
