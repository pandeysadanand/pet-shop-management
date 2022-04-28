package com.bl.petshop;

public class Pet {
	enum Colour {
		RED, GREEN, BROWN, WHITE, BLACK, BLACK_WHITE;
	}
	
	String id;
	String name;
	Colour colour;
	int price;
	
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}

	public void eat() {
		System.out.println(getClass().getSimpleName() + " eats.");
	}
	
}
