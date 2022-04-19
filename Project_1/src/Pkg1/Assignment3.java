package Pkg1;

public class Assignment3 {
	
	public Assignment3() 
	{
		this(6, 98, 7);
		System.out.println("Default Constructor");
	}
	
	public Assignment3(int a)
{	 
		this(23, 3, 55, 35);
		System.out.println("one parameterized constructor");
		
	}

	    public Assignment3(int a , int b)
{
	  this();
			System.out.println("2 parameterized constructor");
			}
public Assignment3(int a , int b, int c)
{
				System.out.println("3 parameterized constructor");
			}
           public Assignment3(int a , int b, int c, int d)
{
        this(29, 78);
        	System.out.println("4 parameterized constructor");
			}
public static void main(String[] args) {

	Assignment3 abc=new Assignment3(2);
	
   		
}
	
}







    

	
	
	
	




	



