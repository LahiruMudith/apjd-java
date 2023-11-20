import java.util.Scanner;
import java.util.Arrays;

class Demo45{
	public static void main(String[]args){
		Scanner lahiru = new Scanner(System.in);
		int i = 0;
		
		Student[] students = new Student[5];		
		for ( i=0 ; i<students.length; i++){
			
			students[i] = new Student();
			
			System.out.print("Enter student " +(i+1)+ " name : ");
			students[i].name = lahiru.next();
						
			System.out.print("Enter student " +(i+1)+ " age : ");
			students[i].age = lahiru.nextInt();
			
			System.out.print("Enter student " +(i+1)+ " address : ");
			students[i].address = lahiru.next();
			
			System.out.print("Enter student " +(i+1)+ " mark : ");
			students[i].mark = lahiru.nextDouble();
			
			System.out.println();						
			
		}
		//Student 1 out put
		System.out.println("details of student : " + (i+1) + "," +students[0].name + "," + students[0].age + "," + students[0].address + "," + students[0].mark );
		
		//Student 2 out put
		System.out.println("details of student : " + (i+1) + "," +students[1].name + "," + students[1].age + "," + students[1].address + "," + students[0].mark );
		
		//Student 2 out put
		System.out.println("details of student : " + (i+1) + "," +students[2].name + "," + students[2].age + "," + students[2].address + "," + students[2].mark );
		
		//Student 2 out put
		System.out.println("details of student : " + (i+1) + "," +students[4].name + "," + students[4].age + "," + students[4].address + "," + students[4].mark );
		
		//Student 2 out put
		System.out.println("details of student : " + (i+1) + "," +students[5].name + "," + students[5].age + "," + students[5].address + "," + students[5].mark );
	
		}
	}

class Student{
	String name;
	int age;
	String address;
	double mark;
	}
