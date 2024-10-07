package basicjava;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of string 1");
		String one=s1.next();
		System.out.println("Enter the value of string 2");
		String two=s1.next();
        char[] c1= one.toCharArray();
		char[] c2=two.toCharArray();
		System.out.println(c1);
		System.out.println(c2);
		Arrays.sort(c1);
		System.out.println("After sorting"+Arrays.toString(c1));
		Arrays.sort(c2);
		System.out.println("After sorting"+Arrays.toString(c2));
		
			boolean valid=Arrays.equals(c1,c2);
			if(valid==true)
					{
				System.out.println("given strings are anagram");}
					else
					{
						System.out.println("given strigs are not anagram");
					}
			
			
			
		}
		
	}


