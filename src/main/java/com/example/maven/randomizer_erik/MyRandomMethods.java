package com.example.maven.randomizer_erik;

import java.util.Random;

public class MyRandomMethods {
	
	Random random = new Random();
	
	public int randomBetween1and10() {
		return random.nextInt(10)+1;
	}
	
	public int randomBetween11and20() {
		return random.nextInt(10)+11;
	}
	
	public int randomBetween21and30() {
		return random.nextInt(10)+21;
	}
	
	public int randomBetween31and40() {
		return random.nextInt(10)+31;
	}
	
	public int randomBetween41and50() {
		return random.nextInt(10)+41;
	}
	
	

}
