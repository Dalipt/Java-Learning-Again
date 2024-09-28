package com.java.String;
/* IN java string is manage by string constant pool inside heap area
 * In case of direct literal once string got created it will return reference if it direct literal
 * In case of new keyword string reference not got return reference implicitly*/
public class LaunchString1 {

	public static void main(String[] args)
	{
		/*If we create a string by String class a reference created in String Constant pool*/
		String st= "Developer";
		String st1= "Developer";
		/*== compare reference of String above reference equils so true*/
		System.out.println(st==st1);
		
		String str= new String("Java");
		String str1= new String("Java");
		/*In this case it will give us false because both reference having two difference object references*/
		System.out.println(str==str1);
		/*equals method we use in string to compare equal string object data it will give use true because both object is having common data*/
		System.out.println(str.equals(str1));
		
		String stn= "Java";
		String stn1= new String("Java");
		System.out.println(stn.equals(stn1));//true
		System.out.println(stn==stn1);//false
		
		String stx="Java";
		String stv="java";
		System.out.println(stx.equals(stv));//false
		System.out.println(stx.equalsIgnoreCase(stx));//true

	}

}
