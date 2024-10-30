package com.java.collection.Map;

import java.util.*;

interface alpha
{
	interface beta
	{
		static void dis()
		{
			System.out.println("Static method in beta Interface");
		}
	}
}
public class LaunchTreeMap {

	public static void main(String[] args)
	{
		//alpha.beta.dis();
		HashMap<Integer, String> hm= new HashMap<>();
		hm.put(1, "SQL");
		hm.put(2, "MS SQL");//---->One Key-value pair is known as Entry
		hm.put(3, "MS-DBA");
		//System.out.println(hm);
		//String hmm=hm.get(1);
		//System.out.println(hmm);
		//Extracting values in Map
		System.out.println("values");
		Collection<String>values=hm.values();
		Iterator<String>itr=values.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Extracting only key in Map
		System.out.println("Keys");
		Set <Integer> st=hm.keySet();
		Iterator<Integer> it= st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//Extracting key-value in Map
		Set ent=hm.entrySet();
		Iterator it3=ent.iterator();
		while(it3.hasNext())
		{
			Map.Entry pair=(Map.Entry)it3.next();
			System.out.println("Key: "+pair.getKey()+" "+"Values: "+pair.getValue());
		}
	}

}
