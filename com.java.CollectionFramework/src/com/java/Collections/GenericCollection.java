package com.java.Collections;
import java.util.*;

class Employees
{
	private String name;
	private String city;
	private int id;
	
	
	
	@Override
	public String toString() {
		return "Employees [name=" + name + ", city=" + city + ", id=" + id + ", ]";
	}



	public Employees(String name, String city, int id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}

}


public class GenericCollection {

	public static void main(String[] args)
	{
		//ArrayList<Object> obj= new ArrayList<Int>();
		ArrayList<Employees> ad= new ArrayList<>();
		ad.add(new Employees("Ram","Jalandhar",1));
		ad.add(new Employees("Ramu","Jalr",2));
		ad.add(new Employees("Rams","Jalaar",3));
		//ad.add(new Employees("Tam","Delhi",4));
		//ad.add(new Employees("Fam","Jalandhar",5));
		//System.out.println(ad);
		for(Employees es:ad)
		{
			System.out.println(es);
		}
	}

}
