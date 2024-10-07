package basicjava;

public class OrderOfExecution {
	
	{
	System.out.println("IIB");
	}
	static
	{
		System.out.println("SIB");
	}
	OrderOfExecution()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		new OrderOfExecution();
		
	}
	}


