package package1;

public class Reverse {
	
	Reverse(){
		this(123);
		System.out.println("Finding reverse......");
	}
	
	Reverse(int n){
		
		int r,s=0;

		while(n>0){

		r=n%10;
		s=(s*10)+r;
		n=n/10;

		System.out.println("reversed number is "+s);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse obj1 = new Reverse();

	}
	
}
