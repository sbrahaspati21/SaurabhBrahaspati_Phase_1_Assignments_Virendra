package Assignment_2_Package1;

public class ClassN {
	
	protected long ll = 200;
	public int age = 21;
	protected float f = 33.33f;

	
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
		System.out.println("ClassN");
		System.out.println("The age id = " + age);
		System.out.println("Value of ll = " + ll);
		System.out.println("Value of f = " + f);

	}
	
	

}
