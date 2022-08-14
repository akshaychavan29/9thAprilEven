package controlStatements;

public class NestedIfElse {

	public static void main(String[] args) 
	{
		//if username is correct then enter password
		//if password is correct then login succesfully
		//else password is wrong---> please enter valid password
		//else username is wrong--->please enter valid username
		
		 String Username="akshay";
		 String password="akshay@123";
		 
		 if (Username=="akshay")
			 
		 {
			 System.out.println("if username is correct then enter password");
			 
			 if  (password=="akshay@123")
			 {
				 System.out.println("if password is correct then login succesfully");
			 }
			 else
			 {
				 System.out.println("else password is wrong---> please enter valid password");
		     }
			 
		 }
			 else
			 {
				 System.out.println("else username is wrong--->please enter valid username");
			 }
		 
			 


	}

}
