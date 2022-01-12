package Assignment_5_OOPs;

abstract class vehicle{
	int speed = 45;
	long distance = 4500;

	vehicle(){
		System.out.println("Vehicle is created");
	}
	vehicle(int a, long d)
	{
		speed = a;
		distance =d;
	}
	
	public void fuel(int a){
		System.out.println("Value is = " + a);
	}
	
	public void fuel (float f, String s){
		System.out.println("Value is = " + f+ " and = "  + s);
	}
	
	public void fuel(char c, int a){
		System.out.println("Value is = " + c+ " and = " + a);
	}
	
	abstract void run();
	abstract void stop();
	
}

 class vehicle1 extends vehicle{

	 void method(){
		 System.out.println ("Speed of Vehicle is = " + speed + " Distance of Vehicle is = " + distance);
	 }
	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}

	class twoW extends vehicle {
		int speed = 55;
		long distance = 4300;
		int num_of_tire = 2;
		
		void display(){
			System.out.println("\n"+"class twoW speed = " + speed +"\n"+ "class twoW distance = " + distance +"\n"+ "class twoW num_of_tyre = " +num_of_tire );
			System.out.println("class vehicle speed = " +super.speed +"\n"+"class vehicle distance = " + super.distance+"\n");
		}
		twoW(){
			System.out.println("twow is created");
		}
		 void run(){
			System.out.println("class twoW run");
		}
		void stop(){
			System.out.println("class twoW stop"+"\n");
		}
	}
	
	
	class threeW extends vehicle {
		int speed = 40;
		long distance = 4650;
		int num_of_tire = 3;
		
		void display(){
			System.out.println("\n"+"class threeW speed = " + speed +"\n"+ "class threeW distance = " + distance +"\n"+ "class threeW num_of_tyre = " +num_of_tire );
			System.out.println("class vehicle speed = " +super.speed +"\n"+"class vehicle distance = " + super.distance+"\n");
		}
		threeW(){
			System.out.println("threeW is created");
		}
		 void run(){
			System.out.println("class threeW run");
		}
		void stop(){
			System.out.println("class threeW stop"+"\n");
		}
	}
	
	class fourW extends vehicle {
		int speed = 35;
		long distance = 3900;
		int num_of_tire = 4;
		
		void display(){
			System.out.println("\n"+"class fourW speed = " + speed +"\n"+ "class fourW distance = " + distance +"\n"+ "class fourW num_of_tyre = " +num_of_tire );
			System.out.println("class vehicle speed = " +super.speed +"\n"+"class vehicle distance = " + super.distance+"\n");
		}
		fourW(){
			System.out.println("fourW is created");
		}
		 void run(){
			System.out.println("class fourW run");
		}
		void stop(){
			System.out.println("class fourW stop"+"\n");
		}
	}

	class eightW extends vehicle {
		int speed = 60;
		long distance = 5100;
		int num_of_tire = 8;
		
		void display(){
			System.out.println("\n"+"class eightW speed = " + speed +"\n"+ "class eightW distance = " + distance +"\n"+ "class eightW num_of_tyre = " +num_of_tire );
			System.out.println("class vehicle speed = " +super.speed +"\n"+"class vehicle distance = " + super.distance+"\n");
		}
		eightW(){
			System.out.println("eightW is created");
		}
		 void run(){
			System.out.println("class eightW run");
		}
		void stop(){
			System.out.println("class eightW stop"+"\n");
		}
	}

public class AssignOOPs {
	public static void main(String[] args) {
		
		
		vehicle v1 = new twoW();
		v1.run();
		v1.stop();
		vehicle v2 = new threeW();
		v2.run();
		v2.stop();
		vehicle v3 = new fourW();
		v3.run();
		v3.stop();
		vehicle v4 = new eightW();
		v4.run();
		v4.stop(); 
		
		vehicle cc = new vehicle1();
		((vehicle1) cc).method();
		
		twoW t = new twoW();
		t.display();
		threeW tt = new threeW();
		tt.display();
		fourW f = new fourW();
		f.display();
		eightW e = new eightW();
		e.display();
		
		vehicle1 vv = new vehicle1 ();
		vv.fuel(40);
		vv.fuel('a', 45);
		vv.fuel(39.3f, "Hi");
		
		
	
		
	}

}
