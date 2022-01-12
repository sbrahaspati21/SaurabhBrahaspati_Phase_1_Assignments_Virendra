package Assignment_2_Package2;

import Assignment_2_Package1.ClassM;
import Assignment_2_Package1.ClassN;
import Assignment_2_Package1.ClassP;

public class ClassZ {

	public static void main(String[] args) {
		
		new ClassM().methodPublic();
		
		System.out.println("\n");
		
		new ClassN().methodPublic();
		
		System.out.println("\n");
		
		new ClassP().methodPublic();
		
		System.out.println("\n");
		
		new ClassX().methodPublic();
		new ClassX().methodDefault();
		new ClassX().methodProtected();

	}

}
