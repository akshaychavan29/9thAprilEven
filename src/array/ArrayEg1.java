package array;

public class ArrayEg1 {

	public static void main(String[] args) 
	{ //i want to store friends name
		
		System.out.println("String study");

		//1 array declaration
		String name[]=new String[8];
		
		//2 array initialization/ assign
		name[0]="akshay";
		name[1]="vivek";
		name[2]="sudhir";
		name[3]="samir";
		name[4]=null;
	    name[5]="rohit";
	    name[6]="krupal";
	    name[7]="sachin";

	    

		//3 array usage
		System.out.println(name[2]);
	
		System.out.println("int study");
		int age[]=new int[5];
		
		age[0]=27;
		age[1]=30;
		age[2]=26;
		age[3]=23;
		age[4]=22;
		
		System.out.println(age[3]);

		System.out.println("float study");
        float weight[]=new float[5];
		
		weight[0]=60.2f;
		weight[1]=63.8f;
		weight[2]=59.7f;
		weight[3]=65.7f;
		weight[4]=66.4f;
		
		System.out.println(weight[4]);
		
		System.out.println("float study");
        char initial[]=new char[5];
		
		initial[0]='A';
		initial[1]='V';
		initial[2]='S';
		initial[3]='S';
		initial[4]='R';
		
		System.out.println(initial[1]);
		
		System.out.println(name.length);
		System.out.println("============================================");
		
		for (int i=0; i<=6;i++)  //static coding
		{
			System.out.println(name[i]);
		}
		
		System.out.println("============================================");
        for (int i=5;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		
        System.out.println("============================================");
        System.out.println(name.length-1);
        System.out.println("============================================");

        for (int i=0;i<=name.length-1;i++)  //dynamic coding
        {
        	System.out.println(name[i]);
        }
       
        System.out.println("============================================");
        for (int i=name.length-1;i>=0;i--)
        {
        	System.out.println(name[i]);
        }


	}

}
