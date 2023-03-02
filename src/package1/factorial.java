package package1;

public class factorial {
	int n =5;
	
	public int fact(int n){
		int f=1;
	for(int i=1;i<=n;i++){
	  f=f*i;
	}
	return f;

	}
	
    void display() {
    	
		
		System.out.println("Factorial of is " +this.fact(n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factorial obj1 = new factorial();
		obj1.display();
		

	}

}
