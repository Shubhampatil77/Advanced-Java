package Collection;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		{
			HashMap<Integer,String>map=new HashMap<Integer,String>();
			map.put(1, "Amit Patil");
			map.put(2,"Raj Patil");
			map.put(3,"Shubham Patil");
			map.put(4,"Ram Patil");
			for(Map.Entry<Integer,String>e:map.entrySet());
			{
				System.out.println("Roll No="+e.getkey()+"Name="+e.getValue);
			}
			System.out.println("No Of First =");
			map.remove(2);
			System.out.println("After Remove:");
			for(Map.Entry<Integer,String>e.map.entrySet())
				System.out.println("Roll No="+e.getKey()+"Name="+e.getValue());
		}
	}
}
