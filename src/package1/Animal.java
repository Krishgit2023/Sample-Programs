package package1;

public class Animal {
	
	String category = "Dog";
	String color = "White";
	
	void display() {
		
		System.out.println("Category is " +category);
	}
	
	void eat() {
		
		System.out.println("Dog is eating - check for method");
	}
	
	Animal(){
		System.out.println("Check for constructor");
	}

}
