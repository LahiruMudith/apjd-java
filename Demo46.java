import java.util.Scanner;

class Demo46{
	public static void main(String[]args){

	
	/* Student std1 = new Student();
		std1.name = "Lahiru";
		std1.age = 17; */
	
	Student std2 = new Student("mudith", 17, "geu");
		
		System.out.println(std2.name +" "+ std2.age);
	
    	}
   }

class Student{
	String name;
	static int age;
	String address;
	
	public Student(String name, int age, String address){
		this.name=name;
		this.age=age;
		this.address=address;
		}
		
	{
	System.out.println("....Instance Block...");
	}
		
	public Student(){
		System.out.println("Im a constructor...");
		}
		
	static{
		System.out.println("Hey...I'm static.");
		}
		
	}
	
	
	
