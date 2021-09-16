package com.nt.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(67);
		l.add(77);
		l.add(37);
		l.add(90);
		l.add(12);
		
		for(int i: l){
			System.out.println(i);
		}

	}

}
