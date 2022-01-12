package Assignment_7_InnerClass;

class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        carName = name;
        carType = type;
    }

    // private method
    private String getCarName() {
        return carName;
    }

// inner class
    public void method(){
    
    class Engine {
        String engineType;
        
        void setEngine() 
        {

           // Accessing the carType property of Car
            if(carType.equals("4WD"))
            	{
                                                             // Invoking method getCarName() of Car           	
		                if(getCarName().equals("Crysler")) 
		                	{
		                    	engineType = "Smaller";
		                	} 
		                else 
		                	{
		                		engineType = "Bigger";
		                	}
            	}
            
            else
            	{
            		engineType = "Bigger";
           		}
            
        }
        
        String getEngineType()
        {
            return engineType;
        }
    }
    
    Engine e = new Engine();
    e.setEngine();
    System.out.println("Engine Type for 8WD= " + e.getEngineType());
    
    Engine e1 = new Engine();
    e1.setEngine();
    System.out.println("Engine Type for 4WD= " + e1.getEngineType());
    
   }
   
}

public class InnerInnerComplex {
    public static void main(String[] args) {

// create an object of the outer class Car
        Car car1 = new Car("Mazda", "8WD");
        car1.method();
        
        Car car2 = new Car("Crysler", "4WD");
        car2.method();
  }
}

