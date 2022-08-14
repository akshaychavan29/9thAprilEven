package array;

public class MultiDimensionalArray {

	public static void main(String[] args) 
	{
		//1.array declaration
		String name[][]=new String[3][2];
		
		//2.array assign
		name[0][0]="Akshay";
		name[0][1]="Sudhir";
		name[1][0]="Krupal";
		name[1][1]="Vivek";
		name[2][0]="Samir";
		name[2][1]="Rohit";
		
		//3.array usage

		System.out.print(name[0][0]+"  ");
		System.out.println(name[0][1]);
		System.out.print(name[1][0]+"  ");
		System.out.println(name[1][1]);
		System.out.print(name[2][0]+"  ");
		System.out.println(name[2][1]);

		System.out.println("=================================");
		for(int i=0;i<=2;i++) //outer for loop for rows //i=0-2
		{
			for(int j=0;j<=1;j++) //inner for loop for column //j=0-1
			{
				System.out.print(name[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
