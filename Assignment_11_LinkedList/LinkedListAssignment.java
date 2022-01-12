package Assignment_11_LinkedList;

import java.util.*;

public class LinkedListAssignment {

	public static void main(String[] args) {
		int a1=6;
		LinkedList<String> LL = new LinkedList<String>();
		
		
		LL.add("May");
		LL.add("June");
		LL.add("July");
		LL.add("August");
		LL.add("November");
		LL.addLast("December");
		LL.addFirst("January");
		LL.add(1,"Febuary");
		LL.add(2,"March");
		LL.add(3,"April");
		LL.add(8,"September");
		LL.add(9,"october");
		System.out.println(LL+"\n");
		System.out.println("Even Months are = " + LL.get(1)+" , "+ LL.get(3)+" , "+ LL.get(5)+" , "+ LL.get(7)+" , "+ LL.get(9)+" , "+ LL.get(11)+"\n");
		System.out.println("Odd Months are = " + LL.get(0)+" , "+ LL.get(2)+" , "+ LL.get(4)+" , "+ LL.get(6)+" , "+ LL.get(8)+" , "+ LL.get(10)+"\n");
	
		Iterator itr = LL.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
			}
		System.out.println("\n");
		System.out.println("The First Month is = "+LL.getFirst()+" and The Last Month is = "+LL.getLast()+"\n");
		
		System.out.println("Your Birthday Month 'March' is Removed = "+LL.remove("March")+"\n");
		if(LL.contains("December"))
		{
			System.out.println("Any Winter months in LinkedList = YES"+"\n");
		}
		else if(LL.contains("January"))
		{
			System.out.println("Any Winter months in LinkedList = YES"+"\n");
		}
		else if(LL.contains("Febuary")){
			System.out.println("Any Winter months in LinkedList = YES"+"\n");
		}
		else {
			System.out.println("Any Winter months in LinkedList = NO"+"\n");
			
		}
	}
}
