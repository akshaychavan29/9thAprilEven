package abstractStudy;

public class ConcreteClass extends Sample {

	public static void main(String[] args)
	{
		ConcreteClass cc=new ConcreteClass(); //created object of  concrete class
		cc.test1();
		cc.test2();
		
		cc.test3();
		cc.test4();
		cc.test5();
		
		cc.test6();

	}

	@Override
	public void test3() 
	{
		System.out.println("This is test3");
	}

	@Override
	public void test4() 
	{
		System.out.println("This is test4");
	}

	@Override
	public void test5() 
	{
		System.out.println("This is test5");
	}
	
	public void test6()
	{
		System.out.println("test6 method is own method of cc");
	}

}
