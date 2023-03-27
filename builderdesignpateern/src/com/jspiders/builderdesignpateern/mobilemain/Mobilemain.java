package com.jspiders.builderdesignpateern.mobilemain;

import com.jspiders.builderdesignpateern.Mobile.Mobile;
import com.jspiders.builderdesignpateern.mobilebuilder.MobileBuilder;

public class Mobilemain {

	public static void main(String[] args) {
			Mobile mobile  = new MobileBuilder().Name("Oneplus 10 pro").Brand("oneplus").colour("white").getMobile();
			System.out.println(mobile);
			
			
			
			
			
	}
}
