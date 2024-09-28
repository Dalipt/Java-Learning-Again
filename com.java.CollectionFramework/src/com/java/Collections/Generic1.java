package com.java.Collections;
import java.util.*;
public class Generic1 {

	public static void main(String[] args) 
	{
		ArrayList <String>al= new ArrayList<String>();
		al.add("Tajak");
		al.add("Shyam");
		al.add("Issue withour type safty");
		/*When its type safe it not allowing on different type*/
		//al.add(29);
		
		System.out.println(al);
		
		String st= (String) al.get(0);
		String sp=st.toLowerCase();
		System.out.println(sp);
		
		String st1= (String) al.get(1);
		String sp1=st1.toLowerCase();
		System.out.println(sp1);
		
		String st2= (String) al.get(2);
		String sp2=st2.toLowerCase();
		System.out.println(sp2);
		/*Without type Safety when we access item that is diferent type in collection exception come 
		 * on run time
		 * In case of Array we specify type at first so no other data allowed by compiler at compile time itself
		 * But this is not case in collection so application terminate abnormally
		 * 
		 * In below code we got run time exception of casting*/
		String st3= (String) al.get(3);
		String sp3=st3.toLowerCase();
		System.out.println(sp3);
		/*For this issue Generic or type safety for collection introduce*/
	}

}
