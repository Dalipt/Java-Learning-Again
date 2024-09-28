package com.java.Collections;

/*Implement set interface
 * Load factor added 
 * BogO(n) without any collision Hashfunction magic
 * order of insertation is not preserve
 * */
import java.util.HashSet;
public class LaunchHashSet {

	public static void main(String[] args)
	{
		HashSet hs= new HashSet();
		hs.add(100);
		hs.add(10);
		hs.add(125);
		hs.add(175);
		hs.add(200);
		hs.add(75);
		
		System.out.println(hs);
		hs.add(10);
		System.out.println(hs);
	}

}
