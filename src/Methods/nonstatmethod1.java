package Methods;

public class nonstatmethod1 {

	public static void main(String[] args) 
	
	{
		//class name object name= new class name();
		nonstatmethod1 n=new nonstatmethod1(); //non static regular method with same class
		
		//object name.class name();
		n.myclass1();
		
		nonstatmethod r=new nonstatmethod(); //non static regular method with differnt class
		r.myclass();
	}
	
	public void myclass1()
	
	{
		System.out.println("my smart phone run on android system");
		
	}
	
	
}
