package practice;
import java.io.*;

public class p1{
	public static void main(String[] args)
	{
		
		String line;
		
		try
		{
			
		BufferedReader br = new BufferedReader (new FileReader ("C:\\Users\\Lucky\\eclipse-workspace\\practice\\src\\practice\\example.txt"));
		
		
		while(( line = br.readLine())!=null)
		{
			System.out.println(line);
		}
		}
		
		catch (Exception e)
	
		{
			e.printStackTrace();
		}
		
	
	}

}
