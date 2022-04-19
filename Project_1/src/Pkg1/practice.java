package Pkg1;

public class practice {
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sumresult is "+c);
		return c;
	}
	
	 public int multi(int d, int e)
	 {	
	 int f;
	 f=d*e;
	 System.out.println("2nd result is"+f);
	 return f;
}

   public int sub(int g , int h) {
	   
	   int i;
   	   i=g-h;
   	  System.out.println("sub res is "+i);
   	  return i;
}
     public void div(int j, int k)
     {
    	int l;
    	l=j/k;
    	System.out.println("final res "+l );
     }
     
     public static void main(String[] args) {
		
    	 practice abc=new practice();
    	 int sumresult= abc.sum(10, 5);
    	 int multiresult= abc.multi(sumresult, 2);
    	 int subresult= abc.sub(multiresult, 4);
    	 abc.div(subresult, 2);
    	 
    	 
     }
     	 
	}	


