package Pkg1;

public class Arithmetic {
	
	public int sum(int a, int b) 
	{
		
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
		
		
	}
	
	public int sub(int x, int y)
	
	{
		int z;
		z=x-y;
		System.out.println("sub value is "+z);
		return z;
		
	}
	
	public void multi(int a1, int b1)
	
	{
		int c1;
		c1=a1*b1;
		System.out.println("multi result is "+c1);
		
	}
     
	public static void main(String[] args) {
		
		Arithmetic abc=new Arithmetic();
		
		int sumresult=abc.sum(10, 2);
		int subresult=abc.sub(10, 2);
		abc.multi(sumresult, subresult);
		
		
		
		 
		
		
		
	}
}
