package collectionStudy;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args)
	{
		java.util.LinkedHashSet ls=new java.util.LinkedHashSet<>();
		
		ls.add("Akshay");
		ls.add(525);
		ls.add(64.97);
		ls.add('M');
		ls.add(true);
		ls.add(525);
		ls.add(null);
		ls.add(null);
		
		System.out.println(ls);
		System.out.println(ls.size());	
		System.out.println(ls.isEmpty());
		System.out.println(ls.contains(525));
		System.out.println(ls.remove(null));
		System.out.println(ls);
		System.out.println(ls.add(null));
		System.out.println(ls);
		
		System.out.println("============for each loop===================");
		for(Object d:ls)
		{
			System.out.println(d);
		}
		
		System.out.println("============iterator===================");
		Iterator it=ls.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	
		

		
		
		
	}

}
