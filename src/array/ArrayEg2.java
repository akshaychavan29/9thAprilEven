package array;

public class ArrayEg2 {

	public static void main(String[] args) 
	{
	
		int rollNum[]=new int[6];
		int rollNum1[]= {1,2,3,4,5,6,7};     	//1+2
		
	System.out.println(rollNum1[4]);
		
	System.out.println("=============================");
	for(int i=0;i<=5;i++)
	{
		System.out.println(rollNum1[i]);
	}

	System.out.println("=============================");
	for(int i=0;i<=rollNum1.length-1;i++)
	{
		System.out.println(rollNum1[i]);
	}
	
	System.out.println("=============================");
	for(int i=rollNum1.length-1;i>=0;i--)
	{
		System.out.println(rollNum1[i]);
	}
	
	
	}

}
