package package1;

import java.util.ArrayList;

public class Collection {
	public static void main(String args[]) {
		ArrayList <String> obj = new ArrayList <String>();
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		
		System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println(obj.remove(2));
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		//System.out.println(obj.add(1,"Pomgranate"));
		
		ArrayList <String> obj1 = new ArrayList <String>();
		obj1.add("Beans");
		obj1.add("Carrot");
		obj.addAll(obj1);
		System.out.println(obj);
		System.out.println(obj.contains("apple"));
		
		
	}

}
