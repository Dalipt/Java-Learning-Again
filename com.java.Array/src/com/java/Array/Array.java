package com.java.Array;

import java.util.Scanner;

/*Array is index based data structure store large homogeneous data
 * In Java array is treated as object
 * */
public class Array
{
	public static void main(String[] args)
	{
		/**Syntax of Array
		DataType[I'm array] variable name= new Array[size]*/
		int [] marks = new int[5];
		//or directly as below
		//int [] mark= {12,15,12,232,32,3232,23}; 
		//System.out.println(mark[7]);
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<marks.length;i++)
		{
		 System.out.println("Enter the marks of Student:"+i);	
		 marks[i]=sc.nextInt();
		}
//		int[] marks	=new int[5];
//		marks[0]=10;
//		marks[1]=20;
//		marks[2]=30;
//		marks[3]=30;
//		marks[4]=50;
//		int x= marks[4];
		System.out.println("Marks of stuent in array:");
		for(int i=0; i<marks.length;i++)
		{
			System.out.println("Marks of array as:"+ marks[i]);
		}
	}
}
