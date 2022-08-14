package controlStatements;

public class SwitchCase {

	public static void main(String[] args) 
	{
	 char grade='C';
     switch (grade) 
     {
	case 'A': System.out.println("my marks is greater than 90");    
	break;
	 
	case 'B': System.out.println("my marks is >=66 & <90");
	break;
    
	case 'C':System.out.println("my marks is >=50 & <66");
	break;
	 
	case 'D': System.out.println("my marks is >=40 & <50");
	break;
	
	default:System.out.println("invalid range");
    break;
	}
	}

}     

//A--> >90
//B--> >=66-<90
//C--> >=50-<66
//D--> >=40-<50
//E--> invalid range
     