package Assignment_10_Collection;
import java.util.*;

public class Linkedhashmap {

	public static void main(String[] args) {
		Map<Integer ,String> linkedhashmap = new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "Fruit A");
		linkedhashmap.put(2,"Fruit B");
		linkedhashmap.put(3, "Fruit C");
		linkedhashmap.put(4,"Fruit D");
		linkedhashmap.put(5, "Fruit E");
		linkedhashmap.put(6,"Fruit F");
		linkedhashmap.put(7, "Fruit G");
		linkedhashmap.put(8,"Fruit H");
		linkedhashmap.put(9, "Fruit I");
		linkedhashmap.put(10,"Fruit J");
		
		System.out.println("Contents of LinkedHashMap are = " +linkedhashmap);
		for(Integer key: linkedhashmap.keySet()){
			System.out.println(key + " = " + linkedhashmap.get(key));
		}
		linkedhashmap.remove(4);
		linkedhashmap.remove(7);
		System.out.println("After remove of 4 and 7 key the Linkedhashmap is = " + linkedhashmap);
		System.out.println("Linkedhashmap contain Fruit A and Fruit E = " + linkedhashmap.containsValue("Fruit A") + " and " +linkedhashmap.containsValue("Fruit E"));
		System.out.println("Linkedhashmap contain Key 4 or not = " + linkedhashmap.containsKey(4));
		System.out.println("Hashcode of Linkedhashmap is = "+ linkedhashmap.hashCode());
		linkedhashmap.clear();
		System.out.println("Is linkedhashmap is clear or not = "+linkedhashmap.isEmpty());
	}

}
