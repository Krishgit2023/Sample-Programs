package package1;

public class Mammal extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String color = "Black";
		Mammal m = new Mammal();
		System.out.println(m.category);
		m.display();
		m.printcolor();
		System.out.println(color);
		m.eat();
	
		
		
	}
	void printcolor() {
		
		System.out.println(color);
		
		System.out.println(super.color);
	}
	
	void eat() {
		super.eat();
	}
	
	Mammal(){
		super();
	}
	
	class TestInheritance{
	public void main(String args[]) {
		Mammal m = new Mammal();
		m.printcolor();	

}
	}
}

