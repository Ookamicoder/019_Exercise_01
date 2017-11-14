package com.example.maven.randomizer_erik;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRandomMethodsTests {

	MyRandomMethods mrm = new MyRandomMethods();
	boolean result = false;
	@Test
	public void testRandomBetween1and10() {
		int number = mrm.randomBetween1and10();
		if (number>0&&number<=10) {
			result = true;
		}
		assertTrue(result);
	}
	
	@Test
	public void testRandomBetween11and20() {
		int number = mrm.randomBetween11and20();
		if (number>10&&number<=20) {
			result = true;
		}
		assertTrue(result);
	}
	
	@Test
	public void testRandomBetween21and30() {
		int number = mrm.randomBetween21and30();
		if (number>20&&number<=30) {
			result = true;
		}
		assertTrue(result);
	}
	
	@Test
	public void testRandomBetween31and40() {
		int number = mrm.randomBetween31and40();
		if (number>30&&number<=40) {
			result = true;
		}
		assertTrue(result);
	}
	
	@Test
	public void testRandomBetween41and50() {
		int number = mrm.randomBetween41and50();
		if (number>40&&number<=50) {
			result = true;
		}
		assertTrue(result);
	}

}
