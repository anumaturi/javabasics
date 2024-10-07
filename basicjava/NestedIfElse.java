//ASSIGNMENT 8 -Conditional Statement NestedIfELSE
package basicjava;

public class NestedIfElse {

	public static void main(String[] args) {
char gender1='M';
char gender2='F';
int age_kid=4;
int age_adultFemale=30;
int age_adultmale=32;
//one block inside other block is Nestedifelse
//if parent block is false then else will execute
//if parent if is true and it goes inside and if child if is true if block executes or else block executes
if(gender1=='M') //true
{
	if(age_kid<=4)
	{
	System.out.println("ticket is free");
	}
	else
	{
 System.out.println("Fulllticket");
	}
}
else
{
		System.out.println("Ticket id free");

	}
	}
}

