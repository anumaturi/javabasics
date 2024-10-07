//ASSIGNMENT -11  Declaring and updating local and global variable 

package basicjava;

public class UpdateVaraible  
 {
	static int age =30;  // static Global varaible
	int a=22; //nonstatic global
	public static void main(String[] args) 
	{
	
		int number; //Declaring 
		number=30;  //Initialising local varaible 
	    number=22;  //to update just rewrite
		System.out.println(number);
		
		// updating static Global varaiable  
		System.out.println(age);
		age=40; 
		System.out.println(age);
		
		//updating non static global varaiable
		UpdateVaraible u1= new UpdateVaraible();
		System.out.println(u1.a);
		u1.a=23 ;  
		System.out.println(u1.a);
	}
}
