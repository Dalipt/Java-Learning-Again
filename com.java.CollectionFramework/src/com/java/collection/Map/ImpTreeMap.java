package com.java.collection.Map;

import java.util.HashMap;
import java.util.TreeMap;

public class ImpTreeMap {

	public static void main(String[] args) {
		TreeMap hm1= new TreeMap();
		  hm1.put(1, "Learning");
		  hm1.put(2, "Ios"); 
		  hm1.put(3,"Microservices");
		 // hm1.put(null, 1); Key Cannot be null
		  hm1.put(4, 2);
		  hm1.put(5, null);// Value can be null in TreeMap
		  System.out.println(hm1);
	}

}
