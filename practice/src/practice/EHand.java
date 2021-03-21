package practice;



public class EHand {
	

	public static void main(String[] args) 
	{
		try
		{
		int i=0;
		int j=9;
		
		int k=i/j;
		
		if(k==0)
		
			throw new FailureException(" " + "this is totally wrong");
		
			System.out.println(k);
		
		}
		
		catch(FailureException e)
		{
			System.out.println("Error" + e.getMessage());
		}
	}

	

}
