package com.java.Collections;

import java.util.*;

class Mamaml
{	
}

class Mama extends Mamaml
{	
}
public class GenericStaticTest {

	public static void main(String[] args) 
	{
		ArrayList<Mama> al= new ArrayList<>();
		al.add(new Mama());
		al.add(new Mama());
		/*We are telling here How ever extends Mamal can call this because of extends
		*/
		listdisplay(al);
	}
	public static void listdisplay(List <? extends Mamaml> list)
	{
		for(Mamaml m : list)
		{
			System.out.println(m);
		}
	}
	}
	
