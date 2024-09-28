package com.java.String;

public class StringLaunch3 {

	public static void main(String[] args) 
	
	{
		/*Whenever references involved its always heaparea*/
		String st="Java";
		st=st+"Dev";
		System.out.println(st);
		/*Final string reference we can use*/
		final String st1="Jaava";
		String s2="Developer"+ st1;
		System.out.println(s2);

	}

}
