package polyMorphism;

public class MethodOverLoading {

	public static void main(String[] args)
	{
		MethodOverLoading mo =new MethodOverLoading();
		mo.test();
		mo.test(60);
		mo.test(40,10);

	}
		//all methods name are same but we take it here parameters
	public  void test() //non static method with zero parameter
	{
		System.out.println("non static method with zero parameter");
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
		
	
	public void test(int a) //non static method with single parameter
	{
		System.out.println("non static method with single parameter");
		int b=40;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
		
		public void test(int a, int b) //non static method with two parameter
	{
		System.out.println("non static method with two parameter");
		int sum= a+b;
		System.out.println("sum is "+sum);
	}
		
	
}
