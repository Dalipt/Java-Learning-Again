package com.java.Collections;
/*Understanding UpperBound */
import java.util.ArrayList;

class Human
{
	int age;
	public void display()
	{
		System.out.println("I'm Human Dude");
	}
}
class Student extends Human
{
	
}
class Employee
{
	
}
public class GenericMainClass {

	public static void main(String[] args)
	{
	Object obj= new Object();
	String str= new String("Ajsjd");
	//obj=str;
	//str=(String)obj;
	
	ArrayList <Human> mn= new ArrayList<>();
	ArrayList<Student> st= new ArrayList<>();
	//mn=st; /*Not allowing*/
	//st=mn;
	
	ArrayList <?> mn1= new ArrayList<>();/*Wildcard any type*/
	ArrayList<Student> st2= new ArrayList<>();
	mn1=st2;/*Allowing any types*/
	
	ArrayList <? extends Human> mn4= new ArrayList<>();/*Upperbound 
	Either Human type or child of any Human*/
	ArrayList<Student> st5= new ArrayList<>();
	mn4=st5;

	ArrayList<Employee> emr= new ArrayList<>();
	//emr=mn4;/*Emplyee is having no relationship so not allowed*/

	ArrayList<Object> onj= new ArrayList<>();
	//mn4=onj; /*Not allowed because we allowing either Human or child of it upperbound*/
	
	ArrayList <? super Human> mn6= new ArrayList<>();/*Lowerbound 
	Either Human type or Parent of any Human*/
	ArrayList<Employee> st6= new ArrayList<>();
	//mn6=st6;/*No logical relationship*/
	
	ArrayList<Human> st1= new ArrayList<>();
	mn6=st1;/*Allowed because either Human or parent of Human*/
	System.out.println("**************************");
	ArrayList <? super Human> mns= new ArrayList<>();/*Lowerbound 
	Either Human type or Parent of any Human*/
	
	ArrayList<Object> bjt1= new ArrayList<>();
	mns=bjt1;/*Allowed because either Human or parent of Human So Human super is Object class */
	
	}

}
