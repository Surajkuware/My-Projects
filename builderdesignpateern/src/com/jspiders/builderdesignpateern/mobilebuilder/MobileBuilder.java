package com.jspiders.builderdesignpateern.mobilebuilder;

import com.jspiders.builderdesignpateern.Mobile.Mobile;

public class MobileBuilder {
	private String Name;
	private String Brand;
	private String processor;
	private String Colour;
	private String Ram;
	private String Battery;
	private double price;

	public MobileBuilder Name(String name) {
		this.Name = name;
		return this;
	}

	public MobileBuilder Brand(String brand) {
		this.Brand = brand;
		return this;
	}

	public MobileBuilder processor(String processor) {
		this.processor = processor;
		return this;

	}

	public MobileBuilder colour(String Colour) {
		this.Colour = Colour;
		return this;

	}

	public MobileBuilder Ram(String Ram) {
		this.Ram = Ram;
		return this;

	}
	public MobileBuilder Battery(String Battery) {
		this.Battery=Battery;
		return this;
	}
	public MobileBuilder Price(int price) {
		this.price=this.price;
		return this;
	}

	public Mobile getMobile() {
		Mobile mobile=new Mobile(this.Name, this.Brand, this.processor, this.Colour, this.Ram, this.Battery, this.price);
		
		return mobile;
	}
}
