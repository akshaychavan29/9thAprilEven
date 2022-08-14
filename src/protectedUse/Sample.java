package protectedUse;

import accessSpecifier.PrivacyUse;

public class Sample extends  PrivacyUse
	{

	public static void main(String[] args) 
	{
		PrivacyUse p=new PrivacyUse(); //overall project
		p.test1();
		//p.test4();
		
		System.out.println("=================");
		
		Sample s=new Sample(); // PrivacyUse by using inheritance 
		s.test1();
		s.test4();
		
	}

}
