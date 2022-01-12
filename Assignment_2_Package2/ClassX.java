package Assignment_2_Package2;

public class ClassX {

	private int age = 22;
	long l = 111;
	protected float f = 44.44f;
	public char ch = 'h';
	
	public void methodPublic(){
		methodPrivate();
	}
	
	void methodDefault(){
		methodPrivate();
	}
	
	protected void methodProtected(){
		methodPrivate();
	}
	
	private void methodPrivate(){
		System.out.println("ClassX");
		System.out.println("Age is = " + age);
		System.out.println("Value of l = " + l);
		System.out.println("Vlaue of f = " + f);
		System.out.println("Value of ch = " + ch);
		
	}
	
}
