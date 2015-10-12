package com.techelevator.farm;

import static com.techelevator.farm.Animal.*;

public class OldMcDonald {
	public static void main(String[] args) {
		
		Animal[] farmAnimals = new Animal[] { new Cow(), new Chicken(), new Duck(), new Horse(), new Pig(), new Walrus(), new Wolf() };
		
		for(Animal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println(NAME_OF_FARMER+" had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a "+name+", ee, ay, ee, ay, oh!");
			System.out.println("With a "+makeSoundTwice(animal)+" here");
			System.out.println("And a "+makeSoundTwice(animal)+" there");
			System.out.println("Here a "+sound+" there a "+sound+" everywhere a "+sound+" "+sound);
			System.out.println();
		}
		
		Chicken myChicken = new Chicken();
		myChicken.layEgg();
		
		Animal animal = myChicken;
		// animal.layEgg(); // this is a compile error because the Animal interface does not have a layEgg method
	}
}
