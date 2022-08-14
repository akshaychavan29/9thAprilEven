package thisAndSuperUse;

public class ThisUse {

	int a=20; //non static global variable
	static int b=30; //static global variable
	
	public static void main(String[] args) 
	{
		ThisUse tu=new ThisUse(); //object creation
		tu.sample();

	}
	
	public void sample()
	{
		int a=10; //local variable
		int sum=a+80;
		int sum1=this.a+60;
		
	    int b=50; //local variable
		
	    System.out.println("this is local value "+a);
		System.out.println("this is global value "+this.a);
		
		System.out.println("sum is "+sum);
		System.out.println("value of a is "+sum1);
		
		System.out.println("this is local value of b is "+b);
		System.out.println("this is global value of b is "+this.b);
	}
		
}
