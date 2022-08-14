package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy1 {

	public static void main(String[] args) 
	{

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

	   System.out.println(al);
	   
	   //for loop
	   System.out.println("=======for loop================");

	   for (int i=0;i<=5;i++)
	   {
		   System.out.println(al.get(i));
	   }
		
	 //for each
	   System.out.println("=======for each loop================");
	   
		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		//iterator
		 System.out.println("=======iterator================");
		 Iterator<Integer> it = al.iterator();
		 while(it.hasNext()) 
		 {
			 System.out.println(it.next());
		 }
		 
		//listIterator
		 System.out.println("=======listIterator================");
		 ListIterator<Integer> li = al.listIterator();
	     while(li.hasNext())
	     {
	    	 System.out.println(li.next());
	     }
				 


		
		
		
		
		
		
		
		
		
		
		
		
	}

}
