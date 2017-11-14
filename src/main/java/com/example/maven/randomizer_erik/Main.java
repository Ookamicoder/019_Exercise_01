package com.example.maven.randomizer_erik;

public class Main {

	public static void main(String[] args) {
		MyRandomMethods mrm = new MyRandomMethods();
		System.out.println("A random number between 1 and 10: "+mrm.randomBetween1and10());
		System.out.println("A random number between 11 and 20: "+mrm.randomBetween11and20());
		System.out.println("A random number between 21 and 30: "+mrm.randomBetween21and30());
		System.out.println("A random number between 31 and 40: "+mrm.randomBetween31and40());
		System.out.println("A random number between 41 and 50: "+mrm.randomBetween41and50());

	}

}
