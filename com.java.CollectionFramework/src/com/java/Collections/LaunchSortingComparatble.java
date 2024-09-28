package com.java.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
/*Simple implementation of Comparable Interface*/
class Cricketer implements Comparable<Cricketer>
{
	public String name;
	public int age;
	public double average;
	public Cricketer(String name, int age, double average) {
		super();
		this.name = name;
		this.age = age;
		this.average = average;
	}
	@Override
	public String toString() {
		return "Cricketers [name=" + name + ", age=" + age + ", average=" + average + "]";
	}
	@Override
	public int compareTo(Cricketer o) 
	{
		
		  if(this.average>o.average)
		  { 
			  return 1;
		  } 
		  return -1;
		 
		//return this.name.compareTo(name); 
		//return o.name.compareTo(o.name);
		};
}
public class LaunchSortingComparatble {

	public static void main(String[] args)
	{
		Cricketer cr = new Cricketer("Sourabh",9,97.55);
		Cricketer cr1 = new Cricketer("RobinSingh",11,55.4);
		Cricketer cr2 = new Cricketer("Agarakar",8,81);
		ArrayList<Cricketer> cl= new ArrayList<>();
		cl.add(cr);
		cl.add(cr1);
		cl.add(cr2);
		System.out.println(cl);
		Collections.sort(cl);
		System.out.println(cl);

	}

}
