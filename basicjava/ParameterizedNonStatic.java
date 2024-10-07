//Calling NonParameterized NonStatic Methods
package basicjava;

public class ParameterizedNonStatic 
{void add(int a,int b )
	{
	System.out.println(a*b);
	}

void naming(String Fname)
{
	System.out.println(Fname);
	}
public static void main(String[] args) {
	ParameterizedNonStatic p1= new  ParameterizedNonStatic();
	p1.add(11, 13);
	p1.naming(null);
}

}
