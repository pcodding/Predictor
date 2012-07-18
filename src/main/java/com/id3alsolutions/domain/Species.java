package com.id3alsolutions.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "species")
@XmlAccessorType(XmlAccessType.NONE)
public class Species extends Tree {
	private static final long serialVersionUID = 2216411566382484631L;
	/**
	 * Name of the tree
	 */
	@XmlElement(name = "name")
	private String name;
	/**
	 * 
	 */
	@XmlElement(name = "rootFlareCalculation")
	private String rootFlareCalculation;
	/**
	 * 
	 */
	@XmlElement(name = "crownWidthCalculation")
	private String crownWidthCalculation;

	// rootflarealgo -- input is dbh as int, returns inches ---
	// (5.28*[DBH])^.0635
	// crownwidthalgo -- input is dbh as int, returns feet
	// global:: ok - warn - critical threshold (root flare vs blvd width)

	public Species() {

	}

	public Species(String name, String rootFlareCalculation,
			String crownWidthCalculation) {
		this.name = name;
		this.rootFlareCalculation = rootFlareCalculation;
		this.crownWidthCalculation = crownWidthCalculation;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rootFlareCalculation
	 */
	public String getRootFlareCalculation() {
		return rootFlareCalculation;
	}

	/**
	 * @param rootFlareCalculation
	 *            the rootFlareCalculation to set
	 */
	public void setRootFlareCalculation(String rootFlareCalculation) {
		this.rootFlareCalculation = rootFlareCalculation;
	}

	/**
	 * @return the crownWidthCalculation
	 */
	public String getCrownWidthCalculation() {
		return crownWidthCalculation;
	}

	/**
	 * @param crownWidthCalculation
	 *            the crownWidthCalculation to set
	 */
	public void setCrownWidthCalculation(String crownWidthCalculation) {
		this.crownWidthCalculation = crownWidthCalculation;
	}
}