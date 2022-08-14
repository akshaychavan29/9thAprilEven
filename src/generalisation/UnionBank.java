package generalisation;

public class UnionBank implements RBI {

	@Override
	public void deposit()
	{
		System.out.println("UnionBank deposit IR=7%");		
	}

	@Override
	public void loan()
	{
		System.out.println("UnionBank loan IR=8.7%");		
	}

	@Override
	public void transfer() 
	{
		System.out.println("UnionBank transfer IMPS, RTGS, NEFT");		
	}

	void UnionBankApp()
    {
		System.out.println("UnionBank own method");
	}
}
