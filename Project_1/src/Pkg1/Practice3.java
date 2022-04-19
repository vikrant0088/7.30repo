package Pkg1;

public class Practice3 {

      public Practice3() {
		this(3, 5, 6);
		
    	System.out.println("0 pramiter");
    	}
      public Practice3(int a) {
    	  this();
    	  
  		
      	System.out.println("1 pramiter");
      	}
      
      public Practice3(int a, int b) { 
    	  this(3);
    	 System.out.println("2 pramiter");
      	}
        
      public Practice3(int a, int b, int c) {
    	  this(9, 8, 7, 6);
    	  
  		
      	System.out.println("3 pramiter");
      	}
                
      public Practice3(int a, int b, int c, int d) {
  		
      	System.out.println("4 pramiter");
      	}
        
        
      public Practice3(int a, int b, int c, int d, int r) {
    	  this(2, 3);
    	  		
      	System.out.println("5 pramiter");
      	}
        
        public static void main(String[] args) {
			
        	Practice3 result=new Practice3(1, 2, 3, 4, 5);
        	
		}
        
        
      
      
	
	
}
          
     
     
