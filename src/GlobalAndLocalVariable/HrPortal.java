package GlobalAndLocalVariable;

public class HrPortal {

	public static void main(String[] args) 
	{
		Employee akshay=new Employee();
		akshay.emp_name="Akshay";
		akshay.emp_gender='M';
		akshay.emp_salary=51999.11f;
		akshay.emp_age=27;
		
		Employee suyog=new Employee();
		suyog.emp_name="Suyog";
		suyog.emp_gender='M';
		suyog.emp_salary=81999.11f;
		suyog.emp_age=23;
		
		Employee bunty=new Employee();
		bunty.emp_name="bunty";
		bunty.emp_gender='M';
		bunty.emp_salary=99999.99f;
		bunty.emp_age=28;
		
		akshay.emp_info();
		suyog.emp_info();
		bunty.emp_info();
	
		}

}
