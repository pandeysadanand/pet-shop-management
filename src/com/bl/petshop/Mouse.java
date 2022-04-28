package com.bl.petshop;

public class Mouse extends Pet implements Swimable {

	public Mouse() {
		name = "Mouse";
		colour = colour.WHITE;
	}
	
	@Override
	public void swim() {
		System.out.println("Mouse swims.");
	}
}
