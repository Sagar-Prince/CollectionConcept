package com.nt.collection;

import java.util.ArrayList;
import java.util.Scanner;
//to create arrayList of employee obj and search for a particular employee obj based on id number

public class EmpList {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		//Create an arrayList atl to store employee obj
		ArrayList<Employee> atl=new ArrayList<>();
		
		//accept 5 employee details and store into an arraylist
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter Id : ");
			int id=sc.nextInt();
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter Address: ");
			String Address=sc.next();
			
			//create employee object with accepted data
			Employee obj = new Employee (id, name, Address);
			
			//store employee object into atl
			atl.add(obj);
	}
		//now search for an employee id
		System.out.println("Enter Id for Search :");
		int id=sc.nextInt();
		
		boolean found=false;
		//search all element in arraylist
		for(int i=0; i<atl.size(); i++)
		{
			//get() mehtod of arrayllist will return i-th employee object. 
			Employee obj=atl.get(i);
			//check if given id is equal to id of employee obj 
			if(id==obj.id)
			{
				obj.display();//display that Employee data
				found = true;                         
				
			}
		}
		if(!found)
			System.out.println("employee id not found");
		
    }

}
