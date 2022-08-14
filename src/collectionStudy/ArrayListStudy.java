package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Akshay");  //add method
		al.add(200);
		al.add(38.33);
		al.add('M');
		al.add(null);
		al.add(null);
		al.add("Akshay");
		al.add(true);
	
		System.out.println(al); //Print
		System.out.println(al.size());  //size method
		System.out.println(al.get(3));  //get method
		
		System.out.println(al.indexOf("Akshay"));  //indexof method
		System.out.println(al.lastIndexOf("Akshay")); 
		
		System.out.println(al.contains("akshay"));  //contains method
		System.out.println(al.contains("Akshay"));
		
		System.out.println(al.remove(4));  //index basis
		System.out.println(al);
		
		al.add(3, "Aurangabad");  //add method	
		System.out.println(al);  
		
		System.out.println(al.remove(null));  //element basis
		System.out.println(al);
		
		System.out.println("==============================================");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println(al.get(6));
		System.out.println("==============================================");

		//printing element using for loop(static or hard coding)
		for(int i=0;i<=6;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("==============================================");

		//printing element using for loop(dynamic coding)
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("===========for each loop=================");

		//for each loop
		for (Object a:al)
		{
			System.out.println(a);
		}
		System.out.println("============iterator output===================");

		//iterator
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("============ListIterator output===================");

		//listIterator
		ListIterator li = al.listIterator();
	
		while(li.hasNext())
		 {
			 System.out.println(li.next());
		 }

	}

}
