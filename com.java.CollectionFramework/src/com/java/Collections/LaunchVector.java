package com.java.Collections;
import java.util.*;
/*Vector Dictionary*/
public class LaunchVector {

	public static void main(String[] args) 
	{
		Vector vc= new Vector();
		vc.add(23);
		vc.add(43);
		//vc.add(33);
		//vc.add(21);
		//vc.add(22);
		//vc.add(88);
		//vc.add(87);
		//vc.add(22);
		vc.add(22);
		//vc.add(22);
		//vc.add(22);
		//vc.addElement(vc);
		System.out.println(vc);
		Iterator itr = vc.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("**************");
		Enumeration em = vc.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
	}

}
