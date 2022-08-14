package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy1 {

	public static void main(String[] args) 
	{
		Vector<Character> v=new Vector<>();
		
		v.add('A');
		v.add('B');
		v.add('C');
		v.add('D');
		v.add('E');
		v.add('F');
		v.add('G');
		v.add('H');
		
		System.out.println(v);
		
		System.out.println("=========for loop===================");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("=========for each loop===================");
		for(Character a:v)
		{
			System.out.println(a);
		}

		System.out.println("=========iterator===================");
		Iterator<Character> it = v.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		System.out.println("=========ListIterator===================");
		ListIterator<Character> li = v.listIterator();
		
		while(li.hasNext()) 
		{
			System.out.println(li.next());
		}
		
		System.out.println("=========enumration===================");

		Enumeration<Character> ele = v.elements();
		
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
	}

}
