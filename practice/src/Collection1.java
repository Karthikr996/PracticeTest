import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {
public static void main(String[] args)
{
	List<Integer> values = new ArrayList<>();
	values.add(5);
	values.add(8);
	values.add(7);
	values.add(0,2);
	
	for(Integer o : values)	{
		System.out.println(o);
	}
}
}
