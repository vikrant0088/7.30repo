package Pkg1;

public class ClassAB {
	
	
	public void m()
	{
		System.out.println("Default Paramiterzied method");
         this.m1();
      		}
	
		public void m1()
		{
			System.out.println("1 Paramiterzied method");
	         this.m2();
	      		}
			public void m2()
		{
			System.out.println("2 paramiterzied mehod");
			this.m4();
			
					}
			public void m3()
			{
				System.out.println("3 paramiterzied mehod");
				this.m();
						}
			public void m4()
			{
				System.out.println("4 paramiterzied mehod");
			
						}
			public static void main(String[] args) {
			ClassAB mn=new ClassAB();
			mn.m3();
			
			
			
		}
		

	
}
