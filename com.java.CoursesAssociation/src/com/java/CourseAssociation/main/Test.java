package com.java.CourseAssociation.main;

class Test1
{

	public static int mul(int a)
	{
		int s=1;
		a=4;
		for(int j=1; j<=a;j++)
		{
			s=j+(s*j);
		}
		return s;
	}

}

public class Test {

	public static void main(String[] args) {
	
	Test1 tt= new Test1();
	tt.mul(7);
	System.out.println(""+ Test1.mul(7));
	
	}

}
