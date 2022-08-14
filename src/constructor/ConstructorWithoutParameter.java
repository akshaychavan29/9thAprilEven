package constructor;

public class ConstructorWithoutParameter 
{
	int a;  //1. variable declaration
	int b;
	
	public ConstructorWithoutParameter()
	{
		a=10; //2. variable assign/initialization
		b=20;
		System.out.println("the constructor is user defined");
	}
	public static void main(String[] args)
	{
		//call non static regular method in main method
	 ConstructorWithoutParameter t= new ConstructorWithoutParameter();
	 t.subject();

	}

	public void subject()
	{
		int add; //3.variable usage
		add=a+b;
		System.out.println("sum is "+add);
	}
	
	
}
