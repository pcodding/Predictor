package com.id3alsolutions.service;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.id3alsolutions.domain.Measurement;
import com.id3alsolutions.domain.Species;
import com.id3alsolutions.domain.SpeciesList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class SpeciesServiceTest {
	@Autowired
	SpeciesService speciesService;

	Species species;

	@Before
	public void setup() {
		species = new Species("maple", "(5.28*$dbh)^.0635",
				"(7.82^.096*$dbh)*12");
		SpeciesList list = new SpeciesList();
		list.getSpecies().add(species);
		speciesService.setSpeciesList(list);
		speciesService.serialize();
	}

	@Test
	public void testDeserialization() {
		speciesService.deserialize();
		assertTrue(speciesService.findAll().iterator().next().getName()
				.equals(species.getName()));
	}

	@Test
	public void testSerialization() {
		assertTrue(speciesService.getFilePath() != null);
		SpeciesList list = new SpeciesList();
		list.getSpecies().add(species);
		speciesService.setSpeciesList(list);
		speciesService.serialize();
	}

	@Test
	public void testCalculateRootFlare() {
		Measurement rootFlare = speciesService.calculateRootFlareInInches(species,
				10);
		assertTrue(rootFlare.getValueInInches() == 52.0);
	}

	@Test
	public void testCalculateCrownWidth() {
		Measurement crownWidth = speciesService
				.calculateCrownWidthInFeet(species, 10);
		assertTrue(crownWidth.getValueInFeet() == 84);
	}

}