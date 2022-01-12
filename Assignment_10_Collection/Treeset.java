package Assignment_10_Collection;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		TreeSet h = new TreeSet();
		
		h.add("Fruit A");
		h.add("Fruit B");
		h.add("Fruit C");
		h.add("Fruit D");
		h.add("Fruit E");
		h.add("Fruit F");
		h.add("Fruit G");
		h.add("Fruit H");
		h.add("Fruit I");
		h.add("Fruit J");
		 
		System.out.println("Size of TreeSet is "+ h.size());
		System.out.println("remove the element "+h.remove("Fruit A" ));
		System.out.println("remove the element "+h.remove("Fruit B"));
		System.out.println("Does hashset contains this 'Fruit D' element  " + h.contains("Fruit D"));		
		System.out.println("Added Fruit is " + h.add("Fruit k"));
		System.out.println("Added Fruit is " + h.add("Fruit L"));
		System.out.println("is hashset empty  " +h.isEmpty());

		
	}

}
