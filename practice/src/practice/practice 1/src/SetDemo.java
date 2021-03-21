import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Yo implements Comparable<Yo>
{
	int r,m;
	String n;
	public Yo(int r, int m, String n) {
		super();
		this.r = r;
		this.m = m;
		this.n = n;
	}
	@Override
	public String toString() {
		return "[r=" + r + ", m=" + m + ", n=" + n + "]";
	}
	@Override
	public int compareTo(Yo o) {
		// TODO Auto-generated method stub
		return n.length() > o.n.length() ? 1 : -1;
	}
	
	
}
public class SetDemo {
	
	public static void main(String[] args)
	
	{
		Set<Yo> k = new TreeSet<>();
		k.add(new Yo(5, 80, "kim5"));
		k.add(new Yo(6, 90, "juh"));
		k.add(new Yo(7, 85, "khn"));
	
		
		
		for(Yo o : k)
		{
			System.out.println(o);
		}
	}

}
