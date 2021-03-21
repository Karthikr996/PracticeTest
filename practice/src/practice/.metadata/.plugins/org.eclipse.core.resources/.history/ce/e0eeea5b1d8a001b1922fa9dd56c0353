import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class Stud implements Comparable<Stud>
{
	int rno, marks;
	String name;
	public Stud(int rno, int marks, String name) {
		super();
		this.rno = rno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rno=" + rno + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Stud s) {
		// TODO Auto-generated method stub
		return name.length() > s.name.length() ? 1 : -1;
	}
	
	
}

public class Collection1 {
public static void main(String[] args)
{
	List<Stud> k = new ArrayList<>();
	k.add(new Stud(25, 489, "Navin"));
	k.add(new Stud(38, 500, "Jack"));
	k.add(new Stud(26, 305, "Ben"));
	k.add(new Stud(40, 436, "Shark"));
	
Collections.sort(k, (i,j) -> i.marks > j.marks ? 1 : -1) ;
	
	
	for(Stud s : k)	{
		System.out.println(s);
	}
}
}