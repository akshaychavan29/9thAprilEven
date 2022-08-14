package interfaceStudy;

public class Son implements Mother, Father{

	public static void main(String[] args) 
	{
		Son s= new Son();
		s.attitude();
		s.money();
		s.nature();
		s.look();
		s.laptop();

		System.out.println("================================================");
		s.love(); //calling default method from both interface
		
		System.out.println("================================================");
        Mother.test();  //calling static method from mother interface
		Father.test();  //calling static method from father interface
	}

	@Override
	public void attitude() 
	{
		System.out.println("Fathers attitude completed in son class");
	}

	@Override
	public void money() 
	{
		System.out.println("Fathers money completed in son class");
	}

	@Override
	public void nature() 
	{
		System.out.println("Mothers nature completed in son class");
	}

	@Override
	public void look() 
	{
		System.out.println("Mothers look completed in son class");
	}
	
	public void laptop()
	{
		System.out.println("Sons own property");
	}

	@Override
	public void love() 
	{
		Father.super.love();
	    Mother.super.love();

	}

}
