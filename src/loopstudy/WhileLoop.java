package loopstudy;

public class WhileLoop {

	public static void main(String[] args) 
	{
		int i=5;
		
		int a=1;
		while (a<=10) 
		{
			System.out.println(a*i+ "+" +a*i+ "=" +(a*i+a*i));
			a=a+1;
		}
		
		System.out.println("***************");
		
		int b=90;
		while (b>=9) 
		{
			System.out.println(b);
			b=b-9;
		}
			
		}

	}


