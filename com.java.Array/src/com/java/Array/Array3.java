package com.java.Array;

class Alpha {
	int id;
	String name;
	String course;
}

public class Array3 {

	public static void main(String[] args) {

		Alpha[] al = new Alpha[3];

		/*
		 * al[0] = new Alpha(); al[1]= new Alpha(); al[2] = new Alpha();
		 */
		
		for(int i=0;i<al.length;i++)
		{
			  al[i]= new Alpha(); 
		}
		//System.out.println(al[i]);
		al[0].id = 1;
		al[0].name = "Raju";
		al[0].course = "Java";
		System.out.println(al[0].id);
		System.out.println(al[0].name);
		System.out.println(al[0].course);
		
		al[1].id = 2;
		al[1].name = "Raj";
		al[1].course = "Jav";
		
		System.out.println(al[1].id);
		System.out.println(al[1].name);
		System.out.println(al[1].course);

		/*
		 * al[1].id=2; al[1].name="Raj"; al[1].course="va";
		 * System.out.println(al[1].id); System.out.println(al[1].name);
		 * System.out.println(al[1].course);
		 */

	
	}
}