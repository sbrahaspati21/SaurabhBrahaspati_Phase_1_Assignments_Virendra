package Assignment_3_constructor;

public class Assignment_3B_ConstructorOver {

	int aa;
	long rr;
	int bb;
	long ss;
	
	public void Calculate(int p , long q){
	ss= ((p*q)/2) ;
		System.out.println("Area of rohmbus = " + ss);
	}
	
	Assignment_3B_ConstructorOver(){
		System.out.println("Default Constructor");
	}
	
	Assignment_3B_ConstructorOver(int a){
		aa= a;
	}
	
	Assignment_3B_ConstructorOver(int a, int b){
	    aa=a;
		bb=b;
		
	}
	
	Assignment_3B_ConstructorOver(long r){
	rr=r;
	
	}
	
	
	
	public void area1(){
		System.out.println("Area of rectangle = " + (aa * bb));
	}
	public void area2(){
		System.out.println("Area of Square = " + (aa*aa));
	}
	public void area3(){
		System.out.println("Area of Circle = " + (3.14*rr*rr));
	}
	
	public static void main(String[] args) {
		Assignment_3B_ConstructorOver rh = new Assignment_3B_ConstructorOver();
		rh.Calculate(2, 1);
		
		Assignment_3B_ConstructorOver ob1 = new Assignment_3B_ConstructorOver(2,5);
		ob1.area1();
		
		Assignment_3B_ConstructorOver ob = new Assignment_3B_ConstructorOver(2);
		ob.area2();
		
		Assignment_3B_ConstructorOver ob2 = new Assignment_3B_ConstructorOver(3L);
		ob2.area3();
		
		
	}

}
