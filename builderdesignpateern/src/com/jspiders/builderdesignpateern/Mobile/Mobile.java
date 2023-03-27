package com.jspiders.builderdesignpateern.Mobile;

public class Mobile {

	private String Name;
	private String Brand;
	private String processor;
	private String Colour;
	private String Ram;
	private String Battery;
	private double price;

	public Mobile(String name, String brand, String processor, String colour, String ram, String battery,
			double price) {
		super();
		Name = name;
		Brand = brand;
		this.processor = processor;
		Colour = colour;
		Ram = ram;
		Battery = battery;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [Name=" + Name + ", Brand=" + Brand + ", processor=" + processor + ", Colour=" + Colour
				+ ", Ram=" + Ram + ", Battery=" + Battery + ", price=" + price + "]";
	}
	
}
