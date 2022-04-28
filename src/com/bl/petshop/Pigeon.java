package com.bl.petshop;

public class Pigeon extends Pet implements Flyable {

	public Pigeon() {
			name = "Pigeon";
			this.colour = colour.WHITE;
		}
	
	@Override
	public void fly() {
		System.out.println("Pigeon flies");		
	}
}
