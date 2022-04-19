package Pkg1;

public class Student 
{     // boundry of the class
	
	int a;   // we have declared a veriable named a
	
	public void deepak()
	{      // boundry of the method(deepak)
		
		System.out.println("Welcom to all of you");
	}
	 public static void main(String[] args) {
   {      // boundry of the main method
			 Student abc=new Student();  // object created
			 abc.deepak();    // called to method
			 abc.a=400;   // called to variable
			 System.out.println(abc.a);
			 abc.a=123;
			 System.out.println(abc.a);
  }
	}

}
