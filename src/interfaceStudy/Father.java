package interfaceStudy;

public interface Father 
{
	void attitude();
	void money();
	
	default void love ()
	{
		System.out.println("Fathers love");
	}
	
	static void test ()
	{
		System.out.println("Fathers test");
	}

}
