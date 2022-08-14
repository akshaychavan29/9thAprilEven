package polyMorphism;

public class OverRiding  extends A {

	public static void main(String[] args) 
	{
		A a=new A();
		OverRiding or=new OverRiding();
		
		a.test();
		or.test();

	}
	
	public void test ()
	{
		System.out.println("this is OverRiding's method");	
	}

}
