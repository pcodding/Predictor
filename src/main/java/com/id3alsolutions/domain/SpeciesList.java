package com.id3alsolutions.domain;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "speciesList")
@XmlAccessorType(XmlAccessType.NONE)
public class SpeciesList {
	/**
	 * 
	 */
	@XmlElement(name = "species")
	List<Species> species;

	public SpeciesList() {
		species = new LinkedList<Species>();
	}

	public Species findByName(String name) {
		for (Species specie : species)
			if (specie.getName().equals(name))
				return specie;
		return null;
	}

	/**
	 * @return the species
	 */
	public List<Species> getSpecies() {
		return species;
	}

	/**
	 * @param species
	 *            the species to set
	 */
	public void setSpecies(List<Species> species) {
		this.species = species;
	}
}