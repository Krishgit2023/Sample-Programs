package package1;

final public class FinalVariable {
	
	final int speedlimit =10;   //final keyword used, will not run can't overwrite
	final void run() {
		//speedlimit = 50;
	}
	
	class Bike extends FinalVariable{
		void run() {
			
		}
	}
	public static void main (String args[]) {
		FinalVariable f = new FinalVariable();
		f.run();
	}
}
