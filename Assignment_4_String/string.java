package Assignment_4_String;

public class string {
	public static void main(String[] args) {
		String t= "Delhi";   
		String o = "Mumbai"; 
		String k= "delhi";   
		String y= new String ("Mumbai");   
		String l= new String ("delhi"); 
		String p = new String("Hello");  
		if(o.equals(l))
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		if(y.equals(p))
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		if(t == o)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		if(k == y)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		if(p == y)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
			

	}

}
