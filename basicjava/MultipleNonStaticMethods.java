 // ASSIGNMENT 4-Calling Multiple nonstatic methods 

package basicjava; 
public class MultipleNonStaticMethods 
{

	 void add()  //NonStatic Method
	{
		System.out.println("Addition");
	}
	 void sub()
	{
		int age= 20;
		System.out.println(age);
		System.out.println("subtraction");
	}
	 void multiply()
	{
		System.out.println("multiplication");
	}
 public static void main(String[] args) 
{
		 MultipleNonStaticMethods m1= new MultipleNonStaticMethods(); //Creating object or reference varaible to call nonstatic methods
		m1.add();
		m1.sub();
		m1.multiply();
			
		}
}
