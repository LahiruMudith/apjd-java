class encapsulation1{
	public static void main(String[]args){
		
		phone p1 = new phone();
		p1.setBrand("samsung");
		
		System.out.println(p1.getBrand());
		
		/* p1.brand = "samsung";
		p1.model = "s22";
		p1.ram = 12;
		p1.storage = 256;
		p1.isHaveBuletoth = true;
		p1.color = "black"; */
		
		phone p2 = new phone();
		p2.phoneSet("apple", "15 pro max", 12, 512, true, "gold");
		
		/* p2.brand = "apple";
		p2.model = "15 pro max";
		p2.ram = 8;
		p2.storage = 512;
		p2.isHaveBuletoth = true;
		p2.color = "gold"; */
		
		phone p3 = new phone();
		p3.phoneSet("redmi", "12", 8, 256, true, "silver");
		
		/* p3.brand = "redmi";
		p3.model = "12";
		p3.ram = 8;
		p3.storage = 256;
		p3.isHaveBuletoth = true;
		p3.color = "red"; */
		 
		
		}
	}

class phone{
	private String brand;
	private String model;
	private int ram;
	private int storage;
	private boolean isHaveBuletoth;
	private String color;
	
	/* public void phoneOn(){
		System.out.println(ram); */
	
	//setters	
	public String setBrand(String brand){
		this.brand = brand;	
		}
	public String setModel(String model){
		this.model = model;	
		}
	public int setRam(int ram){
		this.ram = ram;	
		}
	public int setStorage(int storage){
		this.storage = storage;	
		}
	public boolean setIsHaveBuletooth(boolean isHaveBuletoth){
		this.isHaveBuletoth = isHaveBuletoth;	
		}
	public String setColor(String color){
		this.color = color;	
		}
	
	//getters	
	public String getBrand(){
		return brand;		
		}
	public String getModle(){
		return model;		
		}
	public String getBrand(){
		return ram;		
		}
	public String phoneGetBrand(){
		return storage;		
		}
	public String phoneGetBrand(){
		return isHaveBuletoth;		
		}
	public String phoneGetBrand(){
		return color;		
		}
		
		
		
	}
	

