package com.java.Collections;

import java.util.*;
/*All collection class are dynamic
 * Concurrent modification happen in case of loops
 * In case we need to get Iterator follow fail fast
 * For failing safe new concurrent class is used */
public class LaunchIterator {

	public static void main(String[] args)
	{
		ArrayList ts= new ArrayList();
		ts.add(13);
		ts.add(24);
		ts.add(10);
		ts.add(21);
		//ts.add(56);
		//ts.add(11);
		
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			ts.add(67);
		}
		
		
		/*
		 * for(int i=0;i<ts.size();i++) { Integer data = (Integer)ts.get(i);
		 * System.out.println(ts); ts.add(44); }
		 */
		//Iterator itr = new Iterator();
		
	}

}
