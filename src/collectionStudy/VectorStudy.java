package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args)
	{
		Vector v=new Vector<>();
		
		v.add(245);
		v.add("Akshay");
		v.add('A');
		v.add(null);
		v.add(null);
		v.add(245);
		v.add(true);
		v.add(25.85);

		System.out.println(v);
		System.out.println(v.size());
		v.add(0, "Chavan");
		System.out.println(v);
		
		System.out.println(v.contains("Akshay"));
		
		v.remove(0);
		System.out.println(v);
		
		//for loop
		System.out.println("===========for loop======================");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
			
		//for loop
		System.out.println("===========for each loop======================");
		for(Object a:v)
		{
			System.out.println(a);
		}
		
		//iterator
		System.out.println("===========iterator======================");
		Iterator it = v.iterator();
	    
	   while(it.hasNext())
	   {
		System.out.println(it.next());   
	   }

	   //ListIterator
		System.out.println("===========ListIterator======================");
		ListIterator li = v.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		//enumration
		System.out.println("===========enumration======================");
		Enumeration ele = v.elements();
		
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
		
	}

}
