package package1;

public class Employeee {

	int id;
	String name;
	Address address;
	
	public Employeee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
		System.out.println(address.zipcode);
	}
	
	
}
