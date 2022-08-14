package stringStudy;

public class StringMethod {

	public static void main(String[] args) 
	{
		//length use
		String s="akshay"; //create object without new keyword
		String s1=new String ("chavan"); //object with new keyword
		String c="";
		String c1=" ";
		String c2=null;
		
		System.out.println(s.length()); 
		System.out.println(s1.length());
		System.out.println(c.length());
		System.out.println(c1.length());
       // System.out.println(c2.length());    null point exception
       System.out.println("========================");
		
		int a = s.length(); //store
		int b = s1.length();

		System.out.println(a);
		System.out.println(b);
		System.out.println("========================");

		//toUpper case use
		
		System.out.println(s.toUpperCase());  //it convert lowercase to uppercase 
		System.out.println(s1.toUpperCase());
		System.out.println("========================");

		//toLower case use
		String s2="AURANGABAD";
		String s3=new String("MAHARASHTRA");
		
		System.out.println(s2.toLowerCase());  //it convert  uppercase to lowercase  
		System.out.println(s3.toLowerCase());
		System.out.println("========================");
		
		//equal to use
		
		String s4="pune"; //in == we compare memory
		String s5="pune";
		String s6=new String ("pune");
		String s7=new String ("pune");
		String s8=new String ("Pune");

		
		System.out.println(s4==s5); //in equals we compare defination & case sensitiveness
		System.out.println(s4==s6);
		System.out.println(s5==s6);
		System.out.println(s6==s7);
		System.out.println(s7==s8);
		System.out.println("========================");

		System.out.println(s4.equals(s5));
		System.out.println(s5.equals(s6));
		System.out.println(s6.equals(s7));
		System.out.println(s7.equals(s8));
		System.out.println("========================");

		//equals ignorecase method //in equals we compare only defination not case sensitiveness
		
		System.out.println(s7.equalsIgnoreCase(s8));
		System.out.println("========================");

		//contains method
		
		String e="suyog";  //in that we have to check continuous sequence of name  
		String e1="suy";   
		String e2="uyo";
		String e3="sog";


		System.out.println(e.contains(e1));
		System.out.println(e.contains(e2));
		System.out.println(e1.contains(e2));
		System.out.println(e.contains(e3));
		System.out.println(e1.contains(e));

		System.out.println("========================");
		
		//isEmpty method
		
		String r="mumbai";  //it gives true value if length is zero
		String r1=" ";
		String r2="";
		String r3=null;
		
		System.out.println(r.isEmpty());
		System.out.println(r1.isEmpty());
		System.out.println(r2.isEmpty());
		//System.out.println(r3.isEmpty());
		System.out.println("========================");

		//blank    //it gives true value if string is empty or white spaces
		
		System.out.println(r.isBlank());   
		System.out.println(r1.isBlank());
		System.out.println(r2.isBlank());
		//System.out.println(r3.isBlank());
		System.out.println("========================");

		//charAt method use
		
		String t="delhi";    //it gives index of char value
		System.out.println(t.charAt(2));
		System.out.println(t.charAt(4));
		System.out.println("========================");

		char city = t.charAt(3);
		System.out.println(city);
		System.out.println("========================");

		//System.out.println(t.charAt(6));
		//System.out.println(t.charAt(-1));
		
		//endsWith method use   //it will check ending char are in sequence or not
		
		String j="abcd";
		System.out.println(j.endsWith("d"));
		System.out.println(j.endsWith("cd"));
		System.out.println(j.endsWith("bcd"));
		System.out.println(j.endsWith("abcd"));
		System.out.println("========================");
		
		//startsWith method use
		
		String g="bharat";
		System.out.println(g.startsWith("bh")); //it will check char starts with name...........
		System.out.println(g.startsWith("rat"));
		System.out.println(g.startsWith("ara",2 )); //it will check char starts with name. from given index..........
		System.out.println(g.startsWith("bha", 0));
		System.out.println("========================");

		//subString method use
		
		String k="maharashtra";
		System.out.println(k.substring(4));  //it will give string from given index
		System.out.println(k.substring(2, 5)); //it will give string from given 1st index to 2nd length-1
		System.out.println(k.substring(3, 7));

	   String akki = k.substring(3);
	   System.out.println(akki);
		System.out.println("========================");

	  // concat method use  //it will join the word
	   
	   String d="akshay ";
	   String d1="chavan";
	   
	   System.out.println(d.concat(d1));
	   System.out.println(d.concat("chavan patil"));
	   System.out.println(d.concat("patil"));
		System.out.println("========================");

	   //indexOf method use
	   
	   String m= "Tea";
	   int index = m.indexOf('e');
	   
	   System.out.println(index);
		System.out.println("========================");

	   String m1= "India is my country which is 2nd biggest";
	   
	   System.out.println(m1.indexOf('i'));
	   System.out.println(m1.lastIndexOf('i'));
	   System.out.println(m1.indexOf('i',24));
	   System.out.println(m1.indexOf('i',8));
		System.out.println("========================");

	   //replace method use
	   
	   String x="Testing";
	   System.out.println(x.replace('T', 't'));
	   System.out.println(x.replace("ing", ""));
		System.out.println("========================");

	   //split method
	   
	   String name1="Akshay Kakasaheb Chavan Patil";
	   String name[]=name1.split(" ");
	   
	   for(int i=0;i<=3;i++)
	   {
		   System.out.println(name[i]);
	   }
	   }

}
