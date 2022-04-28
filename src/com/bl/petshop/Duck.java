package com.bl.petshop;

public class Duck extends Pet implements Swimable, Flyable {

	public Duck() {
		name = "Duck";
		colour = colour.WHITE;
	}
	@Override
	public void fly() {
		System.out.println("Duck flies.");
	}

	@Override
	public void swim() {
		System.out.println("Duck flies.");
	}
}
