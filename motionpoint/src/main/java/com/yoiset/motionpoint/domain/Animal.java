package com.yoiset.motionpoint.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Animal. It represent higher level on Animal Kingdom
 */
public abstract class Animal {

	/** The blood temperature of the animal. */
	protected int bloodTemperature;

	/**
	 * Locomotion. It suppose to be the way that every kind of animal will move
	 */
	public abstract void move();

	/**
	 * Gets the blood temperature of the animal.
	 *
	 * @return the blood temperature
	 */
	public int getBloodTemperature() {
		return bloodTemperature;
	}

	public void setBloodTemperature(int bloodTemperature) {
		this.bloodTemperature = bloodTemperature;
	}

}
