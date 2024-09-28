package com.java.Collections;

import java.util.*;

public class AccessingCollection {

	public static void main(String[] args)
	{
		ArrayList al= new ArrayList();
		al.add(12);
		al.add(23);
		al.add(22);
		al.add(98);
		
		/*
		 * for(int i=0;i<al.size();i++) { System.out.println(al.get(0)); }
		 */
		for(Object o:al)
		{
		System.out.println(o);
		}
	}

}
