package Assignment_2_Package1;

public class ClassM {

	private int age = 23;
	long ll = 100;
	protected float f = 22.23f;
	

	public void methodPublic(){
		methodPrivate();
	}
	
	protected void methodProtected(){
		methodPrivate();
	}
	
	void methodDefault(){
		methodPrivate();
	}
	
	private void methodPrivate(){
		System.out.println("ClassM");
		System.out.println("The age id = " + age);
		System.out.println("Value of ll = " + ll);
		System.out.println("Value of f = " + f);
	}
}
