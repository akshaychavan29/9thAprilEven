package constructor;

public class ConstructorWithParameter 
{
	int a;
	int b;
	int c;
	
	public ConstructorWithParameter()
	{
		 a=11;  //constructor without parameter
	     b=22;
		 c=33;
	}

	public ConstructorWithParameter(int x)
	{
		 a=x; //constructor with single parameter
		//b=0 c=0
	} 
	
	public ConstructorWithParameter(int x, int y)
	{
		a=x; //constructor with two parameter
		b=y; //c=0
	}
	
	public ConstructorWithParameter(int x, int y, int z)
	{
		a=x; //constructor with three parameter
		b=y;
		c=z;
	}
	
	public static void main(String[] args) 
	{
	  ConstructorWithParameter c= new ConstructorWithParameter();
       c.cal();
       
       ConstructorWithParameter c1= new ConstructorWithParameter(50);
       c1.cal();
       
       ConstructorWithParameter c3= new ConstructorWithParameter(30, 40);
       c3.cal();
       
       ConstructorWithParameter c4= new ConstructorWithParameter(10, 20, 30);
       c4.cal();
	}
	
	public void cal()
	{
		int add;
		int mul;
	
	    add=a+b+c;
	    mul=a*b*c;
	    
	  System.out.println("###########################");
	  System.out.println("addition  is "+add);
	  System.out.println("multiplication is "+mul);
		
	}

}
