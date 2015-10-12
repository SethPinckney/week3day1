package com.techelevator.farm;

public class Chicken implements Animal {
	
	public String getName() {
		return "Chicken";
	}

	public String getSound() {
		return "Bwak, bwak";
	}
	
	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

}
