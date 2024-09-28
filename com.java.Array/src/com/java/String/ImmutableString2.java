package com.java.String;

public class ImmutableString2 {

	public static void main(String[] args) 
	{
		/*equals method comes from Object class compare reference not the contents*/
		String str="Dev";
		String ste= new String("Dev");
		/*Its overridden in string class that why comparing contents*/
		System.out.println(str.equals(ste));
		
		/*In case of String Builder and String Buffer equals method is not overridden so its compare reference variable*/
		StringBuilder sb= new StringBuilder();
		StringBuilder sb1= new StringBuilder();
		System.out.println(sb.equals(sb1));

	}

}
