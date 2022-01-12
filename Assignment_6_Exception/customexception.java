package Assignment_6_Exception;

import java.util.Scanner;

public class customexception {

	static void salary(int sal) throws salsal{
		if(sal<2100){
			throw new salsal("you need to work hard");
		}
		else if (sal<=5000){
			throw new salsal("you salary is somehow good");
		}
		else
		{
			throw new salsal("salary is good");
		}
	}
	public static void main(String[] args) {
		int result=0;
		   Scanner scanner = new Scanner(System.in);  // taking user input from console
	       
	       System.out.println("Enter Salary : ");
	       int sal = scanner.nextInt();
		
		try {
			salary(sal);
		}
		catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("Done");  
	}

}

class salsal extends Exception{
	salsal(String sal) {
		super(sal);
	}
	
}