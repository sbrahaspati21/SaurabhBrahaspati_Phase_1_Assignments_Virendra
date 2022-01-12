package Assignment_3_constructor;

public class Assignment_3A_functionOverloading {

	public void Calculate (int a, int s){
		int sum = a + s;
		System.out.println("Sum = " + sum);
		
	}
	
	public void Calculate(int b , long h){
		System.out.println("Area of rectangle = " + (b * h));
	}
	
	public void Calculate(int r)
	{
		System.out.println("Area of Circle = " + (3.14*r*r));
	}
	
	
	public static void main(String[] args) {
		Assignment_3A_functionOverloading mm = new Assignment_3A_functionOverloading();
		mm.Calculate(4,2);
		mm.Calculate(2,4L);
		mm.Calculate(2);

	}

}
