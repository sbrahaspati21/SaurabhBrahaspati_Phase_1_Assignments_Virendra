package Assignment_9_Serialization_and_Deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Assignment {
     public static void main(String args[]) throws IOException 
	  {
	    Emp obj = new Emp("Chaitanya", 101, 22,"CSE", "absd@gmail.com", 7303423324L,'M');
	    Emp obj1 = new Emp("Aman",  102, 23,"ECE", "fefsfe@gmail.com", 7979453324L, 'M');
	    FileOutputStream fos= null;
	    ObjectOutputStream oos= null;
	    
	    try{ 
	      fos = new FileOutputStream("C://Users//sbrah//Desktop//Simplilearn//Student.ser"); 
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      
	      oos.writeObject(obj1);
	      
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	    finally{
		      oos.close();
		      fos.close();
	    }
     
     //Deserialization
     Emp o=null;
     try{
       FileInputStream fis = new FileInputStream("C://Users//sbrah//Desktop//Simplilearn//Student.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       o = (Emp)ois.readObject();
       ois.close();
       fis.close();
     }
     catch(IOException ioe)
     {
        ioe.printStackTrace();
        return;
     }catch(ClassNotFoundException cnfe)
      {
        System.out.println("Student Class is not found.");
        cnfe.printStackTrace();
        return;
      }
     System.out.println("Student Name:"+o.getStuname());
     System.out.println("Student Age:"+o.getStuid());
     System.out.println("Student Roll No:"+o.getAge());
     System.out.println("Student Address:"+o.getDeptname());
     System.out.println("Student Height:"+o.getGmail());
     System.out.println("Student Height:"+o.getPhoneno());
     System.out.println("Student Height:"+o.getGender());
  }
}

//------------------------------Student-------------------------//
class Emp implements java.io.Serializable{
	  
	  private String stuname;
	  private int stuid;
	  private int age;
	  private String deptname;  
	  private String gmail;
	  private long phoneno;
	  private char gender;//
	  
	  public Emp(String name, int id , int a, String dept,String mail, long contact ,  char tring) {
	    this.stuname = name;
	    this.stuid = id;
	    this.age = a;
	    this.deptname = dept;
	    this.gmail = mail;
	    this.phoneno = contact;
	    this.gender = tring;
	  }

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}

