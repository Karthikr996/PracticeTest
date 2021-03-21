import java.util.*;


public class MapDemo {

	public static void main(String[] args)
	{
		Map<String, String> m = new Hashtable<>();
		m.put("My name is", "Kabali");
		m.put("I am from", "Malaysia");
		m.put("I am a", "Gangster");
		
		Set<String> s = m.keySet();
		
		for(String k : s)
		{
			System.out.println(k + " " + m.get(k));
		}
	}
}
