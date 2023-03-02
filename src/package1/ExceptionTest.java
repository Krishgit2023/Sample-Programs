package package1;

public class ExceptionTest {
	
	public static void main(String args[]) {
	
	int num = 3;
	try {
		int a[] = {1,2,3};
		System.out.println(a[5]);
	int result = num/0;
	System.out.println(result);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("index is not found");
	}catch(ArithmeticException e){
		System.out.println("Division by zero not possible");
	}catch(Exception e){
		System.out.println("Other");
	}finally {
		System.out.println("Finally code block");
	}

}
}
