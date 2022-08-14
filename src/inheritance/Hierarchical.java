package inheritance;

public class Hierarchical {

	public static void main(String[] args)
	{
		A a=new A(); //object of A class
		a.test(); //using  A class object calling A class method
		
		System.out.println("======================");
		
		B b=new B(); //object of B class
		b.test1(); //using  B class object calling B class method 
		b.test(); //using  B class object calling A class method 
		
		System.out.println("======================");
		
		C c=new C(); //object of c class
		c.test2(); //using  C class object calling C class method
		c.test(); //using  C class object calling A class method
		
		System.out.println("======================");

		D d=new D(); //object of c class
		d.test3(); //using  D class object calling D class method
		d.test(); //using  D class object calling A class method

	}

}
