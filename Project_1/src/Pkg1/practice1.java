package Pkg1;

public class practice1 {
	
	public int sum(int a, int b) {
	int c;
	c=a+b;
	System.out.println("sum result is "+c);
	return c;
	}
	
	public void div(int d, int e) {
		int f;
		f=d/e;
		System.out.println("final result is "+f);
		
	}
	
     public static void main(String[] args) {
		
    	 practice1 res=new practice1();
    	 
    	 int sumresult=res.sum(20, 2);
    	 res.div(sumresult, 4);
    	 
    	 
    			 
	}
}
