package com.yoiset.motionpoint.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Animal. It represent higher level on Animal Kingdom
 */
public abstract class Animal {

	/** The blood temperature of the animal. */
	protected int bloodTemperature; 

	
	/**
	 * Move.The way that every kind of animal will move
	 * @return the string
	 */
	public abstract String move();
	
	
	/**
	 * Locomotion. It suppose to be the way that every kind of animal will move
	 * @return the string
	 */
	public String locomotion(){
		return move();
	}
				
	/**
	 * Gets the blood temperature of the animal.
	 *
	 * @return the blood temperature
	 */
	public int getBloodTemperature() {
		return bloodTemperature;
	}

	/**
	 * Sets the blood temperature.
	 *
	 * @param bloodTemperature the new blood temperature
	 */
	public void setBloodTemperature(int bloodTemperature) {
		this.bloodTemperature = bloodTemperature;
	}

}
