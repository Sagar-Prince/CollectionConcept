package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<>();
		laps.add(new Laptop("samsung", "samsung Not9", 4,4000));
		laps.add(new Laptop("Nokia", "N97", 3 ,50000));
		laps.add(new Laptop("oneplus", "oneplus8pro", 8 ,55000));
		
		Comparator<Laptop> com=new Comparator<Laptop>()
		{
			public int compare(Laptop l1, Laptop l2)
			{
				if(l1.getPrice()>l2.getPrice())
					return 1;
				else
				{
					return -1;
				}
			}
		};
		
		Collections.sort(laps, com);
		
		for(Laptop l: laps)
		{
			System.out.println(l);
		}

	}

}
