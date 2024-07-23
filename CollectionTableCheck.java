package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTableCheck {
	
	static void arraysorting() 
	{
		//Sorting is possible only for ArrayList and LinkedList and Vector 
		ArrayList a1= new ArrayList();
		a1.add("kiwi");
		a1.add("Anu");
		a1.add("bhasker");
		a1.add("karthi");
		Collections.sort(a1);  //Math.addexact
		System.out.println(a1);
		
		LinkedList l1= new LinkedList();
		l1.add("kiwi");
		l1.add("Anu");
		l1.add("bhasker");
		Collections.sort(l1);  
		System.out.println(l1);
		
		Vector v1= new Vector();
		v1.add(129);
		v1.add(11);
		v1.add(7);
		v1.add(88);
		Collections.sort(v1);   //sorting possible
		System.out.println(v1);
		
	/*	PriorityQueue p1= new PriorityQueue();
		p1.add(129);
		p1.add(11);
		Collections.sort(p1);   //sorting not  possible
		System.out.println(p1);    */
		

	/*	TreeSet t1= new TreeSet();
		t1.add(129);
		t1.add(11);
		t1.add(7);
		t1.add(88);
		Collections.sort(t1);   // Auto sorting possible
		System.out.println(t1);   */
		
	/*	HashSet h1= new HashSet();
		h1.add(129);
		h1.add(11);
		h1.add(7);
		h1.add(88);
		Collections.sort(h1);   //sorting not  possible
		System.out.println(h1);  */
		
	/*	LinkedHashSet l1= new LinkedHashSet();
		l1.add(129);
		l1.add(11);
		l1.add(7);
		l1.add(88);
		Collections.sort(l1);   //sorting not  possible
		System.out.println(l1);  */
	}
	public static void main(String[] args)
	{
		
// ArrayList-All possible
		ArrayList a1= new ArrayList();
				//add(Object)-Any type of data
		a1.add("kiwi");
		a1.add("Anu");
		a1.add("Anu");
		a1.add(null);
		a1.add(7);
		a1.add('a');
		a1.add(true);
		a1.add(null); //duplicates  & null allowed 
		System.out.println(a1);
	
//Vector-All possible
		Vector v1= new Vector();
		v1.add("kiwi");
		v1.add("Anu");
		v1.add("Anu");
		v1.add(null);
		v1.add(88.99);
		v1.add('a');
		v1.add(true);
		v1.add(null);  //null allowed
		System.out.println(v1);
		
		
//LinkedList-All possible
		LinkedList l1= new LinkedList();
		l1.add("kiwi");
		l1.add("Anu");
		l1.add("Anu");
		l1.add(null);
		l1.add(7);
		l1.add('a');
		l1.add(true);
		l1.add(null); //duplicates  & null allowed 
		System.out.println(l1);
		
//Priority Queue --Duplicate allowed ,Heterogeneous not allowed ,null not allowed ,no sorting ,no order of insertion
		PriorityQueue p1= new PriorityQueue();
		p1.add("kiwi");
		p1.add("Anu");
		p1.add("bhasker");
		//p1.add(11); Heterogeneous not allowed 
		p1.add("goud");
		p1.add("goud"); // duplicate allowed 
		//p1.add(null); //Null not allowed 
		
		System.out.println(p1);
		
//HashSet --Duplicate not allowed ,null allowed ,no sorting ,no order of insertion

		HashSet s1= new HashSet();
		s1.add("kiwi");
		s1.add("Anu");
		s1.add("bhasker");
		s1.add("bhasker");  //duplicate not allowed 
		s1.add(null); //null allowed
		s1.add(88.99); //heterogenous 
		s1.add(true);
		System.out.println(s1);
		
//Treeset --Duplicate not allowed ,Heterogeneous not allowed,null not allowed ,Auto sort ,no order of insertion
		
		TreeSet t1= new TreeSet();
		t1.add("kiwi");
		t1.add("karthi");
		//t1.add(99);  Heterogenous not allowed 
		t1.add("karthi");  //Duplicate  not allowed
		t1.add("goud");
		t1.add("Anusha");  //autosort
		//t1.add(null);  //null not  allowed
		System.out.println(t1);
		
//LinkedHashSet --Duplicate not allowed,null  allowed ,no sorting ,no order of insertion
	
		LinkedHashSet l2= new LinkedHashSet();
		l2.add("kiwi");
		l2.add("Anu");
		l2.add("bhasker");
		l2.add("karthi");
		l2.add(null);         //null allowed
		l2.add(88.99);
		l2.add('a');
		l2.add(true);
		l2.add("karthi");  //Duplicate not  allowed  
		System.out.println(l2);
		arraysorting();	
	}
}
