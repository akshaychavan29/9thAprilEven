package generalisation;

public class Kotak implements RBI{

	@Override
	public void deposit() 
	{
		System.out.println("Kotak deposit IR=5.7%");		
	}

	@Override
	public void loan() 
	{
		System.out.println("Kotak loan IR=6%");		
	}

	@Override
	public void transfer() 
	{
		System.out.println("Kotak transfer IMPS, RTGS, NEFT, CDM");
	}
		
	void kotakApp()
	{
		System.out.println("Kotak own method");
	}
}
