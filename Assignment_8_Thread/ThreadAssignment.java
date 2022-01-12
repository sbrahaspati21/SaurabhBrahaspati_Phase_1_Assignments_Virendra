package Assignment_8_Thread;



class P
{
	synchronized public void run()                     
	{
		
		for (int i = 1; i < 3; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try
			{
				Thread.sleep(400);   
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  
			   System.out.println("running thread name is:"+Thread.currentThread().getName()); 
			   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());
			   System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); 
				 
		}
	}
}

class C extends Thread
{
	
	P line;

	C(P line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.run();
	}
}

public class ThreadAssignment
{
	public static void main(String[] args)
	{
		P obj = new P();

		C t1 = new C(obj);
		C t2 = new C(obj);
		C t3 = new C(obj);
	
		t1.setName("IT");
		t2.setName("HR");
		t3.setName("Finance");
	
		t1.start();
		t2.start();
		t3.start();
		
	}
}
