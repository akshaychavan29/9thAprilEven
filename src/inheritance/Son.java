package inheritance;

public class Son extends Mother  //we extended mother class "super class" in son class "sub class"
{
	
	String name="Handsome";
	static char gender='M';
	
	public void mobile()
	{ 
		System.out.println("sons mobile");
	}
	
	public static  void laptop()
	{
		System.out.println("sons laptop");
	}

	}
