package com.java.collection.Map;

import java.util.*;

class Training {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Training [id=" + id + ", name=" + name + "]";
	}

	public Training(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class ImplementHashMap {

	public static void main(String[] args) {
		/*
		 * It store data in Keyvalue and type will be any type Object Im Hashmap key
		 * must be unique
		 */
		HashMap<Integer, String> hmm = new HashMap<>();
		hmm.put(1, "I Am");
		hmm.put(2, "I Am dev");
		hmm.put(3, "I Am devops");
		System.out.println(hmm);

		
		  Training t= new Training(1,"Java");
		  HashMap hm= new HashMap();
		  hm.put("Allen", "Learning");
		  hm.put(t, "Ios"); 
		  hm.put(3,"Microservices");
		  //Key must be unique 
		  //hm.put(3, "Microservices");
		  hm.put(4,"Microservices");
		  //values can be duplicates 
		  hm.put(null,"Service");
		  //Null can be used as key 
		  hm.put(null,null);//Null can be used as key only
		  // key allowed if we try to put second it will overwrite older
		   System.out.println(hm);
		 
	}

}
