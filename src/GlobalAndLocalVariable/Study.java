package GlobalAndLocalVariable;

public class Study 
{
     int a=70; // non static global  variable a
	 
	 static  int b=50; //static global  variable b
	 
	public static void main(String[] args)
	{
	  Study s=new Study(); //call from non static local variable
	  s.test();
	    
	  test1(); //call from static local variable
	  
	  Study g=new Study();
	  System.out.println("value of non static global variable is a= "+g.a); //from same class
	  System.out.println("value of static global variable is b= "+b);  //from same class
	  int sum=20+g.a;
	  System.out.println("sum is "+sum);
	  int  sub=b-10;
	  System.out.println("sub is "+sub);
	  
		Study1 g1=new Study1();
		System.out.println("value of non static global variable is p= "+g1.p); //from anather class
		System.out.println("value of static global variable is q= "+Study1.q); //from anather class
		int add=5+g1.p;
		System.out.println("add is "+add);
		int subs=Study1.q-10;
		System.out.println("sub is "+subs);
	}

	
	public void test()
	{
		int a=10;
		int b=20;
		int sum;
		sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public static void test1()
	{
		int a=5;
		int b=3;
		int sub;
		sub=a-b;
		System.out.println("sub is "+sub);
	}

}
