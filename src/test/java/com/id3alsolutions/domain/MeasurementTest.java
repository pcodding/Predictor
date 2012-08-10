package com.id3alsolutions.domain;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class MeasurementTest {
	Measurement measurement;

	@Before
	public void setup() {
		measurement = new Measurement(100.0);
		Measurement newm = new Measurement(84.0);
		System.out.println(newm.getValueInFeet());
	}

	@Test
	public void testGetValueInInches() {
		assertTrue(measurement.getValueInInches() == 100.0);
	}
	
	@Test
	public void testGetValueInFeet() {
		System.out.println(measurement.getValueInFeet());
		assertTrue(measurement.getValueInFeet() == 8);
	}
}
