package com.java.Collections;

import java.util.*;

public class LaunchLinkedList 
{
public static void main(String[] args)
{
	LinkedList ll= new LinkedList();
	ll.add(10);
	ll.add(23);
	ll.add("Ramu");
	System.out.println(ll);
	ll.addFirst(78);
	ll.addLast("Colection");
	System.out.println(ll);
	System.out.println(ll.peek());
}
}
