package com.java.collection.Map;
import java.util.*;
//IN map collect pairof key and value know as Entry
public class ImpHashTable {

	public static void main(String[] args)
	{
		Hashtable ht= new Hashtable();
		ht.put(1, "Rama");
		ht.put(2,"shyaam");
		ht.put(3, "Checking ti");
		//Here in HashTable An entry insertation is not preserve
		//ht.put(null, "jado");//Key cannot be null in HashTable
		//ht.put(1, null);//Value also cannot be used as Null in HashTable
		System.out.println(ht);
	}

}
