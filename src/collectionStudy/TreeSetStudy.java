package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		
		ts.add(1);
		//ts.add("Akshay"); //only allows ascending order
		ts.add(4);
		ts.add(3);
		ts.add(3);
		ts.add(5);
		ts.add(2);    
		ts.add(0);

		//ts.add(null);    //will throw nullpointer exception

		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		System.out.println("=============for each loop==================");
		for(Object f:ts)
		{
			System.out.println(f);
		}

		System.out.println("=============iterator==================");
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
