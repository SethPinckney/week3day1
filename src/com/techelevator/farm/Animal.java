package com.techelevator.farm;

public interface Animal {
	
	String NAME_OF_FARMER = "Old McDonald";
	
	public String getName( );
	public String getSound( );
	
	public static String makeSoundTwice(Animal theAnimal) {
		return theAnimal.getSound() + " " + theAnimal.getSound();
	}
}
