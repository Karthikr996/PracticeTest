package practice;

 class uj {
	public  int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	}
 }
	    class classjhg
	    
	    {
	    	
		 public static void main(String[] args) 
		 {
		 
			 uj u = new uj();
			 
			 int result = u.sum(10);
		    System.out.println(result);
		  }
		  
		  }
	 