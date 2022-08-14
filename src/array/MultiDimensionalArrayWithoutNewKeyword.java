package array;

public class MultiDimensionalArrayWithoutNewKeyword {

	public static void main(String[] args) 
	{

		//1+2
		char grade[][]= {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'}};
		
		System.out.println(grade[2][3]);
		
		System.out.println("=================================");
		for(char i=0;i<=2;i++)
		{
			for(char j=0;j<=3;j++)
			{
				System.out.print(grade[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
