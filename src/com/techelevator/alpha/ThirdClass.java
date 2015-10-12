package com.techelevator.alpha;

public class ThirdClass {
	public static void main(String[] args) {
		FirstClass first = new FirstClass();
		String s = first.publicVariable;
		s = first.protectedVariable;  
		s = first.defaultVariable;
		//s = first.privateVariable; //compile error because privateVariable is not visible outside the com.techelevator.alpha package
	}
}
