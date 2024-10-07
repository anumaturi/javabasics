 // ASSIGNMENT 3-Calling Multiple static methods 

package basicjava; 
public class MultipleStaticMethods
{
	static void add()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		int age= 20;
		System.out.println(age);
		System.out.println("subtraction");
	}
	static void multiply()
	{
		System.out.println("multiplication");
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		multiply();
		
	}
}
