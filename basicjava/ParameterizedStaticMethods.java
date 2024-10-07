//Calling Parameterized Static Methods 
package basicjava;

public class ParameterizedStaticMethods {
	
	static void add(int a, int b)
	{ 
		System.out.println(a+b);
	}
	static void sub(double a, double b)
	{ 
		System.out.println(a-b);
	}
	static void character(int a, int b,String name)
	{ 
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		add(10,9);
		sub(9.99,1.11);
		character(11,12,"ANu");
	}

}
