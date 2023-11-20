class laptop{
	public static void main(String[]args){
		
		Laptops lap1 = new Laptops();
		lap1.setBrand("MSi");
		lap1.setRam(8);
		lap1.setStorage(512);
		lap1.setIsHaveTouchDisplat(false);
		
		
		Laptops lap2 = new Laptops();
		lap2.setBrand("asus");
		lap2.setRam(16);
		lap2.setStorage(1000);
		lap2.setIsHaveTouchDisplat(true);	
		
		System.out.println(" ----------------------------" );
		System.out.println(" |   Total laptop details   | ");
		System.out.println(" ----------------------------" );
		System.out.println();
		System.out.println();
		
		int i = 0;
		
		
		System.out.println("---Lap " +(i+1)+ " --- ");
		System.out.println(lap1.getBrand());
		System.out.println(lap1.getRam());
		System.out.println(lap1.getStorage());
		System.out.println(lap1.getIsHaveTouchDisplat());
		i++;
		
		System.out.println();
		
		System.out.println("---Lap " +(i+1)+ " --- ");
		System.out.println(lap2.getBrand());
		System.out.println(lap2.getRam());
		System.out.println(lap2.getStorage());
		System.out.println(lap2.getIsHaveTouchDisplat());	
		
		} 
	}
	
class Laptops{
	String brand;
	int ram;
	int storage;
	boolean isHaveTouchDisplay;
	
	//setters
	public void setBrand(String brand){
		this.brand = brand;
	}
		
	public void setRam(int ram){
		if(ram<32){
		this.ram = ram;
		}
	}
		
	public void setStorage(int storage){
		if(storage<2000){
		this.storage = storage;
		}
	}
		
	public void setIsHaveTouchDisplat(boolean isHaveTouchDisplay){
		this.isHaveTouchDisplay = isHaveTouchDisplay;
	}
		
		
	//getters
	public String getBrand(){
		return brand;
	}
		
	public int getRam(){
		return ram;
	}
		
	public int getStorage(){
		return storage;
	}
		
	public boolean getIsHaveTouchDisplat(){
		return isHaveTouchDisplay;
	}
	
	
	
	
	}
