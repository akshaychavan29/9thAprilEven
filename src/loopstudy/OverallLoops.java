package loopstudy;

public class OverallLoops {

	public static void main(String[] args)
	{   
		System.out.println("***for loop---incremental***");
		for (int a=5; a<=50; a=a+5)  //1 for loop---incremental
		{
			System.out.println(a);
		}
		 
		System.out.println("***for loop---decremental***");
		for (int a=40;  a>=4; a=a-4) //1 for loop---decremental
		{
			System.out.println(a);
		}
		
		System.out.println("***while loop---incremental***");
		int b=3;   //2 while loop---incremental
		while (b<=30) 
		{
			System.out.println(b);
			b=b+3;
		}
		 
		System.out.println("***while loop---decremental***");
		int c=20;  //2 while loop---decremental
		while (c>=2) 
		{
			System.out.println(c);
			c=c-2;
		}
		
		System.out.println("***do while loop---incremental***");
		int d=6;  //3 do while loop---incremental
		do 
		{
			System.out.println(d);
			d=d+6;
		}
		while (d<=60); 
		
		System.out.println("***do while loop---decremental***");
		int e=70;  //3 do while loop---decremental
		do 
		{
			System.out.println(e);
			e=e-7;
		} while (e>=7);

     }

}

