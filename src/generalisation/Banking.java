package generalisation;

public class Banking {

	public static void main(String[] args) 
	
	{
		SBI s=new SBI() ;
		s.deposit();
		s.loan();
		s.transfer();
		s.yono();
		System.out.println("==================================");
		
		Kotak k=new Kotak();
		k.deposit();
		k.loan();
		k.transfer();
		k.kotakApp();
		System.out.println("=================================");
		
		UnionBank u=new UnionBank();
		u.deposit();
		u.loan();
		u.transfer();
		u.UnionBankApp();

	}

}
