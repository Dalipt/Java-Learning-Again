package com.java.String;
/*CompareTo() method compare string values lexingly*/
public class JavaCompareTo {

	public static void main(String[] args)
	{
		String s1= "Virat";
		String s2="Dhoni";
		int res= s1.compareTo(s2);
		System.out.println(res);
		if(res==0)
		{
			System.out.println("String are equals");
		}
		else
		{
			System.out.println("String is not equlas");
		}

	}

}
