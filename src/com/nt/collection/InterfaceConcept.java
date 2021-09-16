package com.nt.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//collection came in 1.2 version and generic came in 1.5 version

//The main objective of generic is to provide type safety and to reduce type casting casting problem

public class InterfaceConcept {

	public static void main(String[] args) {
		
		Collection<Integer> cs=new ArrayList<>();
		cs.add(6);
		cs.add(3);
		cs.add(7);
//		Collection lis = new ArrayList<>();
//		lis.add(2);
//		lis.add("sagar");
//		lis.add(6.9f);
		
		//Basically there is three cursors in java to fetching the element one by one
		//1> Enumeration
		//2> Iterator(universal)
		//3> ListIterator
		
//		Instead of fetching this one by one we can use 'while loop' so that it will print all the element at once
		
//		Iterator i= lis.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
		
		//using while loop
				
		//Iterator i= lis.iterator();
		//while(i.hasNext()) {
		// System.out.println(i.next());
		//}
		
		//Now this become very old technique can we use advance technique yes with the help of enhanced for loop
		
		//by using using enhanced for loop

//		for(Object i : lis) {
//			System.out.println(i);
	//	}
		
		for(int i: cs) {
			System.out.println(i);
		}
	}

}
