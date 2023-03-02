package package1;

public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsKeyword obj = new ThrowsKeyword();
		try {
			System.out.println(obj.divide(45, 0));
		}catch(ArithmeticException e){
			System.out.println("Number can't be divided by 0");
		}

	}
	
	public static int divide(int a, int b) throws ArithmeticException{
		int div = a/b;
		return div;
	}
	

}
