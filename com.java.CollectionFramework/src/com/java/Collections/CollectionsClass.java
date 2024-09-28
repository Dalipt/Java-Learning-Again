package com.java.Collections;
import java.util.*;
public class CollectionsClass {

	public static void main(String[] args)
	{
		ArrayList<Integer> cll= new ArrayList<>();
		
		  cll.add(20); 
		  cll.add(40); 
		  cll.add(30); 
		  cll.add(55);
		  cll.add(70);
		  System.out.println(cll); Collections.sort(cll); System.out.println(cll);
		 
		ArrayList<String> str= new ArrayList<>();
		str.add("Rama");
		str.add("Rajesh");
		str.add("Deewali");
		System.out.println(str);
		Collections.sort(str);
		System.out.println(str);
	}

}
