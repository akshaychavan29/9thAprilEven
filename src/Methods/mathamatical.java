package Methods;

public class mathamatical {

	public static void main(String[] args)
	{
		mathamatical m=new mathamatical();
		m.maths();
	}
	
	public void maths()
	{
		int a;
		int b;
		int add;
		int sub;
		int div;
		int mul;
		int calculation;
		
		a=20;
		b=10;
		add=a+b;
		sub=a-b;
		div=a/b;
		mul=a*b;
		calculation=(a+b)/(a-b);
		
		System.out.println("addition of  a & b is "+add);
		System.out.println("substraction of a & b is "+sub);
		System.out.println(("division of a & b is "+div));
		System.out.println("multiplication of a & b is "+mul);
		System.out.println("calculation of a & b is "+calculation);
		
	}
	
	
	
	
	
	
	
	

}
