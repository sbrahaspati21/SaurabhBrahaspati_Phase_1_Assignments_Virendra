
package Assignment_3_constructor;

public class Assignment_3C_Students {

	String name ;
	int age;
	char section;
	char gender ;
	int sub1;
	int sub2;
	int sub3;
	
	
	Assignment_3C_Students (String n , int a , char c , char cc, int ss1 , int ss2 , int ss3){
		name= n;
		age = a;
		section = c;
		gender = cc;
		sub1 = ss1;
		sub2 = ss2;
		sub3 = ss3;
				
	}
	
	public int marks(){
		int total = sub1 + sub2 + sub3 ;
		return total ;
	}
	
	public float percentage(){
		float per = ((sub1 + sub2 + sub3)*100)/300;
		return per;
	}
	
	public void display(){
		System.out.println(name + " " + age + " " + section + " " + gender + " " + sub1 + " " + sub2 + " " + sub3 + " " + "\n" + "Total Marks = " + marks() + "\n"+ "Percentage = " +  percentage() + "\n");
		
	}
	
	
	
	public static void main(String[] args) {
		Assignment_3C_Students s1 = new Assignment_3C_Students("Aman",21,'A','M',88,78,85);
		
		Assignment_3C_Students s2 = new Assignment_3C_Students("Manan",23,'B','M',89,94,89);
		
		Assignment_3C_Students s3 = new Assignment_3C_Students("Priya",23,'B','F',81,92,84);
		
		Assignment_3C_Students s4 = new Assignment_3C_Students("Anuj",23,'A','M',89,94,89);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}

}
