package Pkg1;

public class Assignment_01 {
	
	public int sum(int a, int b)
	
	{
		int c;
		c=a+b;
		System.out.println("Sum result is "+c);
		return c;
	}
	public int sub(int d, int e)
	{
		int f;
		f=d-e;
		System.out.println("Sub result is "+f);
		return f;
	}
	
	public int multi(int m, int n)
	{
		int o;
		o=m*n;
		System.out.println("multipli result is "+o);
		return o;
	}
	public void div(int p, int q)
	{
		int r;
		r=p/q;
		System.out.println("final result is"+r);
	
	}
	
	public static void main(String[] args) {
		
		Assignment_01 ref=new Assignment_01();
		int sumresult=ref.sum(20, 4);
		int subresult=ref.sub(sumresult, 2);
		int sumresult2=ref.sum(subresult, 2);
		int sumresult3=ref.sum(sumresult2, 4);
		int multiresult=ref.multi(sumresult3, 4);
		ref.div(multiresult, 4);
		}
}


