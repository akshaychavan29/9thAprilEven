package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy1 {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("Boy");
		ll.add("Akshay");
		ll.add("Kakasaheb");
		ll.add("Chavan");
		ll.add("SambhajiNagar");
		ll.add("Software");
		ll.add("Testing");

		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(1));
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		System.out.println("=========for loop=============");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("=========for loop=============");
		for(String s:ll)
		{
			System.out.println(s);
		}
		
		System.out.println("=========iterator=============");
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=========iterator=============");
		ListIterator<String> li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

		
		
		
		
		
		
	}

}
