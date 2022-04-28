package com.bl.petshop;

public class Dog extends Pet implements Swimable {

	public Dog(){
			name = "Dog";
			colour = colour.WHITE;
	}
	@Override
	public void swim() {
		System.out.println("Dog swims.");
	}
}
