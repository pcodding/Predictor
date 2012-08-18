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
	@XmlElement(name = "rootFlareError")
	private String rootFlareError;
	
	/**
	 * 
	 */
	@XmlElement(name = "crownWidthCalculation")
	private String crownWidthCalculation;
	
	/**
	 * 
	 */
	@XmlElement(name = "crownWidthError")
	private String crownWidthError;
	
	/**
	 * 
	 */
	@XmlElement(name = "imageUrl")
	private String imageUrl;
	
	/**
	 * 
	 */
	@XmlElement(name = "imageHeight")
	private String imageHeight;
	
	/**
	 * 
	 */
	@XmlElement(name = "imageWidth")
	private String imageWidth;

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

	/**
	 * @return the rootFlareError
	 */
	public String getRootFlareError() {
		return rootFlareError;
	}

	/**
	 * @param rootFlareError the rootFlareError to set
	 */
	public void setRootFlareError(String rootFlareError) {
		this.rootFlareError = rootFlareError;
	}

	/**
	 * @return the crownWidthError
	 */
	public String getCrownWidthError() {
		return crownWidthError;
	}

	/**
	 * @param crownWidthError the crownWidthError to set
	 */
	public void setCrownWidthError(String crownWidthError) {
		this.crownWidthError = crownWidthError;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the imageHeight
	 */
	public String getImageHeight() {
		return imageHeight;
	}

	/**
	 * @param imageHeight the imageHeight to set
	 */
	public void setImageHeight(String imageHeight) {
		this.imageHeight = imageHeight;
	}

	/**
	 * @return the imageWidth
	 */
	public String getImageWidth() {
		return imageWidth;
	}

	/**
	 * @param imageWidth the imageWidth to set
	 */
	public void setImageWidth(String imageWidth) {
		this.imageWidth = imageWidth;
	}
}