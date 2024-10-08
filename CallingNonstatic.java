package basicjava;   //ASSIGNMENT 4

public class CallingNonstatic 
{
	 void login()
	{
		System.out.println("Logging in");
	}
public static void main(String[] args) 
{
	CallingNonstatic c1=new CallingNonstatic(); //we can call non static method using reference varaiable 
	c1.login();
	
}
}

