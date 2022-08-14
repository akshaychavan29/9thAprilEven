package controlStatements;

public class IfElse {

	public static void main(String[] args) 
	{
		char grade='A'; //if my grade is A i got above 90% marks else i got below 90%
		if (grade=='A') 
		{
			System.out.println("i got above 90% marks");
		}
		else 
		{
			System.out.println("i got below 90% marks");

		}
		
		int marks=87;
		if (marks>81) 
		{
			System.out.println("my marks is greater than 81");
		} else 
		{
			System.out.println("my marks is less than 81");

		}
	}

}
