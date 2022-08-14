package interfaceStudy;

public interface Mother 
{
	void nature();
	void look();
	
	default void love ()
	{
		System.out.println("Mothers love");
	}
	
	static void test ()
	{
		System.out.println("Mothers test");
	}
	
}
