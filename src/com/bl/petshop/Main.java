package com.bl.petshop;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Petshop.");

		Cat cat = new Cat();
		cat.id = "C001";
		cat.price = 5000;
		Dog dog = new Dog();
		dog.id = "D001";
		dog.price = 1000;
		Mouse mouse = new Mouse();
		mouse.id = "M001";
		mouse.price = 12300;
		Pigeon pigeon = new Pigeon();
		pigeon.id = "P001";
		pigeon.price = 2450;
		Duck duck = new Duck();
		duck.id = "DK001";
		duck.price = 5480;
		Parrot parrot = new Parrot();
		parrot.id = "P001";
		parrot.price = 5000;
		
		PetRepository petRepository = new PetRepository();
		petRepository.add(cat);
		petRepository.add(dog);
		petRepository.add(duck);
		petRepository.add(mouse);
		petRepository.add(parrot);
		petRepository.add(pigeon);
		
		UserInterface userInterface = new UserInterface();
		userInterface.printAllPets(petRepository.getPetList());
		System.out.println();
		System.out.println("Parrot has been removed::::::");
		petRepository.remove(parrot);
		userInterface.printAllPets(petRepository.getPetList());
		
	}
}
