package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		
		hs.add("Akshay");
		hs.add('M');
		hs.add(245);
		hs.add(64.90);
		hs.add(true);
		hs.add(245);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);

		//does not supports for loop--> get method is not available 

		System.out.println("==========for each loop===================");
		for(Object d:hs)
		{
			System.out.println(d);
		}
		
		System.out.println("==========iterator===================");
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
