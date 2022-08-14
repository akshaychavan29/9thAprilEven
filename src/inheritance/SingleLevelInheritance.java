package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	{ 
		//object creation
		Mother m=new Mother(); 
		Son s=new Son();
		
		// calling to class by using object (non static)
		m.nature(); //using  mother object calling mother method
		s.mobile(); //using  son object calling son method
		s.nature();  //using son object calling mother method
		
		System.out.println("===================");
		
		// calling  static method  
		Mother.look(); //mother calling its own static method
		Son.laptop(); // son calling its own static method
		Son.look();  //son calling mother static method

		// calling  non static global variable
		System.out.println("============================");
		System.out.println("mother is looking "+m.name1);
		System.out.println("son is looking "+s.name);
		System.out.println("son is looking extends to "+s.name1);
		
		// calling static global variable
		System.out.println("============================");
		System.out.println("gender of mother is "+Mother.gender1);
		System.out.println("gender of son is "+Son.gender);
		System.out.println("gender of son extends to is "+Son.gender1);
	}



}
