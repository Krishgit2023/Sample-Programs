package package1;

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address ad = new Address("TVM","Kerala","India",689545);
		Employeee emp = new Employeee(1, "Krishna", ad);
		emp.display();

	}

}
