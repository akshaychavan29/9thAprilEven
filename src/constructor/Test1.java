package constructor;

public class Test1
{
	String name;
	char gender;
	float weight;
	
	 public  Test1()
	 {
		 name="akshay";
		 gender='m';
		 weight=61.5f;
		 
	 }

	public static void main(String[] args)
	{
		System.out.println("this is my personal information");
		Test1 t=new Test1();
		t.sample();
		
	}
	
	public void sample()
	{
		System.out.println("********************");
		System.out.println("my name is "+name);
		System.out.println("my gender is "+gender);
		System.out.println("my weight is "+weight+" kg");
	}

}
