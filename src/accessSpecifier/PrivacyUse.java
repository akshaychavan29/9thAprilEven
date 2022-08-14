package accessSpecifier;

public class PrivacyUse {

	public static void main(String[] args) 
	{
		PrivacyUse pu=new PrivacyUse(); //object creation for same class
		pu.test1();
		pu.test2();
		pu.test3();
		pu.test4();
	}
	
	public void test1() //public access within project
	{
		System.out.println("This is public test1");
	}
	
	private void test2() //private access within class
	{
		System.out.println("This is private test2");
	}
	
	 void test3 () //default access within package
	 {
		 System.out.println("This is default test3");
	 }
	 
	 protected  void test4 () //protected access within package/ outside package by using inheritance operation
	 {
		 System.out.println("This is protected test4");
	 }
}
