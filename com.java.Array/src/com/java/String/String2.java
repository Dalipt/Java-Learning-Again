package com.java.String;
/*String concatenation using + operator and concate() method
 * From Java 7 String constance pool object colleceted by JVM in last */

public class String2 {

	public static void main(String[] args)
	{
		String str="Developer";
		System.out.println(str);
		str.concat("Java Only");
		System.out.println(str);
		/*We are not assigning reference in concate method so its still contain only str="Developer"*/

		String st="Developer";
		System.out.println(st);
		/*We are assigning reference in concate method so its contain all concated value str="Developer java Only"*/
		st=st.concat(" "+"Java Only");
		System.out.println(st);
		/*Reference spring constant pool*/
		String s1= "Java";
		String s2=s1.concat("Dev");
		String s3="Java Dev";
		System.out.println(s2==s3);
		/*using concate method we can add two string memory in string heap area 
		 * Using + operator we can add multiple string onject direct string object string contant pool */
		
		String sf= "Java"+344+55+44;
		/*In a string anything we concatenation it will become string*/
		System.out.println(sf);
		
		String sp= 344+55+44+"Java";
		/*In a string anything we concatenation it will become string order must me follow*/
		System.out.println(sp);
	}

}
