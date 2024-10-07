package basicjava;

import java.util.Scanner;

public class StringVertically {

	public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
System.out.println("Enter the string to be printed vertically");
String input=s1.nextLine();
for(int i=0;i<input.length();i++)
{
	System.out.println(input.charAt(i));
}
	}

}
