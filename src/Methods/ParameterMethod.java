package Methods;

public class ParameterMethod {

	public static void main(String[] args) 
	{
		ParameterMethod pm=new ParameterMethod(); //object creation for non static regular method
		pm.studentInfo(); //call from non static regular method without parameter/zero parameter
		pm.studentInfo("akshay chavan", 26, 'm', 61.50f, 29); //call from non static regular method with parameter
		
		
	    studentMarks(); //call from static regular method without parameter/zero parameter
	    studentInfo(87, 90, 88, 92); //call from static regular method with parameter
	}
	
	public void studentInfo() //non static regular method without parameter/zero parameter
	{
		String name;
		name= "akshay chavan";
		
		int age;
		age=26;
		
		char gender;
		gender='m';
		
		long mob;
		mob=123456789006l;
		
		float weight;
		weight=61.50f;
		
		int rollnum;
		rollnum=29;
		
		System.out.println("=========================");
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
		System.out.println("my gender is "+gender);
		System.out.println("my mob no is "+mob);
		System.out.println("my weight is "+weight);
		System.out.println("my rollnum is "+rollnum);
		
	}
	
	public void studentInfo(String name, int age, char gender, float weight, int rollnum) //non static regular method with parameter
    {
		System.out.println("=========================");
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
		System.out.println("my gender is "+gender);
		System.out.println("my weight is "+weight);
		System.out.println("my rollnum is "+rollnum);
	}

	public static void studentMarks() //static regular method without parameter/zero parameter
	{
	
		int physics;
		int chemistry;
	    int maths;
	    int biology;
		
		physics=87;
		chemistry=90;
		maths=88;
		biology=92;
		
		System.out.println("================================");
		System.out.println("marks in physics is "+physics);
		System.out.println("marks in physics is "+chemistry);
		System.out.println("marks in physics is "+maths);
		System.out.println("marks in physics is "+biology);
	}
		
	public static void studentInfo(int physics, int chemistry, int maths, int biology) //static regular method with parameter
	{
		System.out.println("================================");
		System.out.println("marks in physics is "+physics);
		System.out.println("marks in physics is "+chemistry);
		System.out.println("marks in physics is "+maths);
		System.out.println("marks in physics is "+biology);
	}
	
	}
	
	
	
	
	
	


