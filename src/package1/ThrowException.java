package package1;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		verify(12);
	}
	
	public static void verify(int age) {
		if(age<18) {
			throw new ArithmeticException("Ineligible to vote");
		}else {
			System.out.println("Eligible to vote");
		}
	}

}
