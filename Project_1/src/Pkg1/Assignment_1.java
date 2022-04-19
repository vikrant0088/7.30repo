package Pkg1;

public class Assignment_1 {
  		public int sum(int a, int b)	{
		int c;
		c=a+b;
		System.out.println("sum result is "+c);
		return c;		
	}
		public int sub(int D, int E)	{
		int F;
		F=D-E;
		System.out.println("sub result is "+F);
		return F;
		}
		public int multi(int j, int k)	{
		int l;
		l=j*k;
		System.out.println("multi result is "+l);
		return l;
			}
		public void div(int m, int n)	{
		int o;
		o=m/n;
		System.out.println("Final result is "+o);
			}
			public static void main(String[] args) {
		
		Assignment_1 ref=new Assignment_1();		
		
		      int sumresult=ref.sum(10, 2);
				int subresult=ref.sub(sumresult, 2);
				int sumresult2=ref.sum(subresult, 2);
				int multiresult=ref.multi(sumresult2, 2);
				ref.div(multiresult, 2);
		      
		   			
		
	}
		
	
	     
	     
}
