class Demo20{
	public static void main(String[]args){
		
	/*	book b1=new book("sadun","ds",56.4,45);
		//b1.setName("kamal");
		
		
		System.out.println(b1.getName());
		
		*/
		book b1=new book();
		b1.setName("kamal");
		b1.author="yasindu";
		
		
		
	/*	book b2=new box();
		b2.setName("chamara");
		
		System.out.println(b2.getName());
		
			*/
		
		box b3=new box();
		b3.getTotal();
		}	
	}

	

class book{
	private String name;
	String author;
	double price;
	int isbnNumber;
	
	void getTotal(){
		int x=10;
		int y=20;
		System.out.println("totol is : "+(x+y));
		}
	
		void setName(String name){
		this.name=name;
	}
	
	String getName(){
		return name;
	}

	
//	void setName(String name){
/*		this.name=name;
	}
	
	String getName(){
		return name;
	}
	
	public book(){
		System.out.println("constructor 1");
	}
	
	public book(String name, String author, double price, int isbnNumber){
		this.name=name;
	}
	*/
	
	
	}
	
	
	
	
class box extends book  {
	
	
	
/*	void test(){
		System.out.println("test 1");
		}
*/
	
	
}


interface A{
	}
	

class AA implements A{
	}
	
class box1 implements A {
	int width;
	int heith;
	
	}
	
