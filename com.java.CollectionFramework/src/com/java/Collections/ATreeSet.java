package com.java.Collections;

import java.util.TreeSet;

/*Index base insertion not allowed
 *Set(Interface Parent)-<<SortedSet(Child) <<Navigableset(Child) <<TreeSet
 * 
 * BeDefault data will got added in shorted order
 * 
 * Duplicate is not allowed in Treeset
 * Best in term of search its follow balance binary tree if tree is not balance then only O(n)
 * */
public class ATreeSet {

	public static void main(String[] args)
	{
		TreeSet ts= new TreeSet();
		ts.add(13);
		ts.add(24);
		ts.add(10);
		ts.add(21);
		ts.add(56);
		ts.add(11);
		System.out.println(ts);
		
		ts.add(11);
		ts.ceiling(56);
		System.out.println(ts.ceiling(20));
		System.out.println(ts.higher(24));
	}

}
