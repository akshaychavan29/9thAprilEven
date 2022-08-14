package generalisation;

public class SBI implements RBI {

	@Override
	public void deposit() 
	{
		System.out.println("SBI deposit IR=5%");		
	}

	@Override
	public void loan() 
	{
		System.out.println("SBI loan IR=8%");		
	}

	@Override
	public void transfer() 
	{
		System.out.println("SBI transfer IMPS, RTGS, NEFT");		
	}

	void yono()
	{
		System.out.println("SBI own method");
	}
	
	
	
	
}
