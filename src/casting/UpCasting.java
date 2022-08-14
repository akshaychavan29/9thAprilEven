package casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		Father f=new Father();
		Son s=new Son();
		
		f.car();
		f.bike();
		
		System.out.println("======================");
		s.car();
		s.bike();
		s.degree();
		
		
		System.out.println("======================");
		Father f1=new Son();
		f1.car();
		f1.bike();
		f1.test();
	  //f1.degree();
		

	}

}
