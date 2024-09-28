package com.java.Array;

import java.util.*;

public class Array2 {

	public static void main(String[] args) 
	{
		
		/*
		 * int [][] marks= new int[3][]; 
		 * marks[0]= new int[4];
		 * marks[1]= new int[2];
		 * marks[2]= new int[3];
		 */
		int[][][] marks =new int[2][3][4];
		
		/*
		 * marks[0]= new int[2][1]; marks[1]= new int[3][1]; marks[2]= new int[4][1];
		 */
		 
		
		//marks[3]= new int[1];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				//System.out.println("Enter marks class:" + i + " "+ "Student:"+j);
				//marks[i][j]= sc.nextInt();
				for(int k=0;k<marks[i][j].length;k++)
				{
				System.out.println("Enter marks class:" + i + " "+ "Student:"+ j +"School" + k);
				marks[i][j][k]= sc.nextInt();
			}}
		}
		System.out.println("Markes Stored for student:");	
		
		for(int i=0;i<marks.length;i++)
		{
		for(int j=0;j<marks[i].length;j++)
		for(int k=0;k<marks[i][j].length;k++)	
		{
			System.out.print(marks[i][j][k]+" ");
		}
		System.out.println();
		}
}
}