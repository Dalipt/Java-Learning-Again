package com.java.Collections;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args)
	{
		Map<String, Integer> mp= new HashMap();
		mp.putIfAbsent(null, 1 );
		mp.put(null, null);
		System.out.println(mp.get(null));
	}

}
