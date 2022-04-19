package Pkg1;


public class Student1 
{
	int age;               //variable 
	int rollno;          // variable
		
	public void deepak()     //method
	{
		System.out.println("Welcom to all of you");
		System.out.println("Automition is very interesty");
	}
	public static void main(String[] args) {
	{           // boundy of main method
		
	Student1 abc=new Student1();    // object created
	abc.deepak();             // called to method
	abc.age= 35;             //called to veriable
	System.out.println(abc.age);
	abc.rollno= 10;         //called to veriable
	System.out.println(abc.rollno);
	
	}
	
	}
	
}
