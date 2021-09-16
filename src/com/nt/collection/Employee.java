package com.nt.collection;

public class Employee {
	int id;
	String Name;
	String Address;

	public Employee(int id, String name, String address) {
		// super();
		this.id = id;
		Name = name;
		Address = address;
	}

	// display employee detail
	public void display() {
		System.out.println(" Id: " + id);
		System.out.println(" Name: " + Name);
		System.out.println(" Address: " + Address);

	}

}
