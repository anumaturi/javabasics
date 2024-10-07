//ASSIGNMENT -7  Conditional IFELSEIF block
package basicjava;

public class IfElseIf {

	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		int c=40;
//whichever first block is true that will execute others will be ignored even if that are true 
		if(a==b) //false
		{
			System.out.println("If block will execute ");
		}
		else if(c!=b) //true -this block will execute as its the first true block 
		{
			System.out.println("Else-if1  block will execute ");
		}
		else if(c!=a) //true--wont execute as first block is executed
		{
			System.out.println("Else-if  block will execute ");
		}
		else
		{
			System.out.println("Else block will execute ");
		}
	}

}
