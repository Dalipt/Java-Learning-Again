package com.java.Collections;
import java.util.*;

class Cricketers 
{
	public String name;
	public int age;
	public double average;
	public Cricketers(String name, int age, double average) {
		super();
		this.name = name;
		this.age = age;
		this.average = average;
	}
	@Override
	public String toString() {
		return "Cricketers [name=" + name + ", age=" + age + ", average=" + average + "]";
	}
	
}
/*We can implement as interface by 
 * Implement
 * Inner class
 * Lamda expression */

class Alpha implements Comparator<Cricketers>
{
	@Override
	public int compare(Cricketers o1, Cricketers o2) {
			/*We can sorting int type easily here*/
		  if(o1.age>o2.age)
		  { 
			  return 1; 
			  } 
		  return -1;
		 
		/*Directly string not got sorted here so we use below
		 * 
		return o1.name.compareTo(o2.name);
		*/
	};
	/*Here we used Lamda expression to complete implementation*/
	Comparator<Cricketers> clg= (Cricketers o1, Cricketers o2)->{
		if(o1.age>o2.age)
		  { 
			  return 1; 
			  } 
		  return -1;
	};
}
public class LaunchSortingComparator {

	public static void main(String[] args) 
	{
		Cricketers cl = new Cricketers("Virat",5,56.23);
		Cricketers cl1 = new Cricketers("Sachidn",2,48.4);
		Cricketers cl2 = new Cricketers("Tendulkar",3,84);
		ArrayList<Cricketers> cll= new ArrayList<>();
		cll.add(cl);
		cll.add(cl1);
		cll.add(cl2);
		System.out.println(cll);
		/*We are not able to sort using Collections class 
		Here different type of data he won't understand on what parameter to use and sort here 
		 * cricketer is having 3 different type of object*/
		//Collections.sort(cll);  
		
		Alpha alf= new Alpha();
		Collections.sort(cll,alf);
		System.out.println(cll);
		
		
		
	}

}
