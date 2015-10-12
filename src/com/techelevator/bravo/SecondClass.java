package com.techelevator.bravo;

import com.techelevator.alpha.FirstClass;

public class SecondClass {
	public static void main(String[] args) {
		FirstClass first = new FirstClass();
		String s = first.publicVariable;
		//s = first.protectedVariable;  //compile error because protectedVariable is not visible outside the com.techelevator.alpha package
		//s = first.defaultVariable; //compile error because defaultVariable is not visible outside the com.techelevator.alpha package
		//s = first.privateVariable; //compile error because privateVariable is not visible outside the com.techelevator.alpha package
	}
}
