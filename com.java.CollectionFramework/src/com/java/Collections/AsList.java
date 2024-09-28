package com.java.Collections;

import java.lang.reflect.Array;
import java.util.*;

public class AsList {

	public static void main(String[] args)
	{
		List<Integer> it= new ArrayList();
		
		List<Integer> itt= Arrays.asList(11,22,33);
		//System.out.println(itt);
	}
		public static Iterable<Integer>getIntegers()
		{
			return new ArrayList<Integer>();
		}
	}
