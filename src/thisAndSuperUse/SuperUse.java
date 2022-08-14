package thisAndSuperUse;

public class SuperUse extends A { //sub class
	
	int a=60; //non static global variable

	public static void main(String[] args) 
	{
		SuperUse SU=new SuperUse();
		SU.test();

	}
	
	public void test()
	{
		int a=40; //non static local variable
		int sum=a+10;
		int sum1=this.a+30;
		int sum2=super.a+20;
		
		System.out.println("sum of local variable is "+sum);
		System.out.println("sum of global variable from same class is "+sum1);
		System.out.println("sum of global variable from anather class is "+sum2);
		
		System.out.println("============================");
		
		System.out.println("This is local variable a "+a);
		System.out.println("This is global variable a from same class "+this.a);
		System.out.println("This is global variable a from anather class "+super.a);
	}

}
