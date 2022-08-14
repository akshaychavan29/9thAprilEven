package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		
		ll.add("Akshay");
		ll.add('M');
		ll.add(245);
		ll.add(63.93);
		ll.add(true);
		ll.add(245);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(4));
		System.out.println(ll.peek());  //peek=peek first
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.poll());  //poll=poll first
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);

		System.out.println("=============for loop====================");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
			
		}
		
		System.out.println("=============for each loop====================");
	    for(Object c:ll)
	    {
	    	System.out.println(c);
	    }
	    
		System.out.println("=============iterator====================");
		Iterator it = ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=============ListIterator====================");
		ListIterator li = ll.listIterator();
		
		while(li.hasNext())
		{
		    System.out.println(li.next());	
		}
		
		
		
		
		
		
		
		
		
	}

}
