package Assignment_2_Package1;

public class ClassP {

	public static void main(String[] args) {
		new ClassM().methodPublic();
		new ClassM().methodDefault();
		new ClassM().methodProtected();
		
		System.out.println("\n");
		
		new ClassN().methodPublic();
		new ClassN().methodDefault();
		new ClassN().methodProtected();
		
	}
	
	public void methodPublic() {
		System.out.println("Class ClassP: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class ClassP: methodProtected");
		
	}

	void methodDefault() {
		System.out.println("Class ClassP: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("Class ClassP: methodPrivate");
	}

}
