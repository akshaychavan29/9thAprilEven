package interfaceStudy;

public final  class A { //if we write final keyword before class name then we cant create sub class

	public static void main(String[] args)
	{  
		//final keyword use for variable, method, class
		int a=30;
		System.out.println(a);
        a=a+20;
		System.out.println(a);
		
		final int b=50;
		System.out.println(b);
		//b=b+10; //final variable wont updation in value
		//System.out.println(b);
		
		A c=new A();
        c.test();
	}
	
		public final void test()
		{
			System.out.println("A's test method");
		}
	
	
	
	
	

}
