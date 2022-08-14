package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		Son n=new Son(); 
		
		n.mobile(); //using sons object calling sons own  method
		n.nature(); //using sons object calling mothers method
		n.recepie(); //using sons object calling grandmothers method
		n.health(); //using sons object calling grandgrandmothers method
		
		System.out.println("====================");
		
		Son.laptop(); //using sons class calling sons own static method
		Son.look(); //using sons class calling mothers static method
		Son.stories(); //using sons class calling garndmothers static method
		Son.age();	 //using sons class calling grandgrarndmothers static method
	}

}
