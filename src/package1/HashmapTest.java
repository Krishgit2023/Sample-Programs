package package1;

import java.util.HashMap;
import java.util.Map;

public class HashmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<Integer,String> map=new HashMap<Integer,String>();
		 map.put(1, "Mango");
		 map.put(2,"Pomgranate");
		 map.put(3, "Orange");
		 map.put(4, "Apple");
		 System.out.println(map);
		 
		 for(Map.Entry<Integer,String> m : map.entrySet()) {
			 System.out.println(m.getKey()+ "" +m.getValue());
		 }
	}

}
