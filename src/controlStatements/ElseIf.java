package controlStatements;

public class ElseIf {

	public static void main(String[] args) 
	{
		String season="summer";
		if (season=="summer") 
		{
			System.out.println("then its very hot");
		}
	   else if(season=="rainy")
		{
		System.out.println("then its raining heavily");	
		}
	   else if(season=="winter")
	   {
		   System.out.println("then its very cold");
	   }
	   else 
	   {
		   System.out.println("its a invalid season");
	   }

	}

}

//if its summer then its very hot
// if its rainy then its raining heavily 
// if its winter then its very cold
// invalid season
