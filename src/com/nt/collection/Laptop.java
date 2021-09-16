package com.nt.collection;


public class Laptop implements Comparable<Laptop>{
	private String brand;
	private String name;
	private int ram;
	private int price;
	
	public Laptop(String brand, String name, int ram, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Lappy [brand=" + brand + ", name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Laptop lap2) {
		//this > lap2 =1;
		//this > lap2 = -1;
		//this == lap2 = 0;
		if(this.getRam()>lap2.getRam())
		{
			return 1;
		}
		return -1;
	}
	
}
