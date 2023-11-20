class extends{
	public static void main(String[]args){
		
		Car c1 = new Car();
		c1.transmission = "five";
		c1.isABS = true;
		
		}
	}

class Vehicle{
	String brand;
	String modle;
	int noOfTyers;
	double enginCap;
	boolean isABS;
	
	public static void start(){
	}
	
	public static void stop(){
	}
	
}

class Car extends Vehicle {
	String transmission;
	int noOfGears;
	}	
	
