package com.java.String;

public class ImmutableString1 {

	public static void main(String[] args) 
	{
		/*If we pass value in constructor its only get added in 16+value in constructor*/
		StringBuffer sb= new StringBuffer("Jai");/*==16+3*/
		System.out.println(sb.capacity());
		sb.append("JAVA");
		sb.append("My India is great");
		/*Formula to increase old capacity*2+2=35 if even one character increase then increase old capacity*2+2*/
		System.out.println(sb.capacity());
		
		StringBuilder sb1= new StringBuilder();
		//System.out.println(sb1.capacity());


	}

}
