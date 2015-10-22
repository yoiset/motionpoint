package com.yoiset.motionpoint.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Canine. Represents Dog
 */
public class Canine extends Mammal implements Communicator {

	/**
	 * Constructor for Canine. Blood Temperature initialized on 60
	 */
	public Canine() {
		setBloodTemperature(60);
	}

	/**
	 * The way of a canine is going to jump
	 * @see com.yoiset.motionpoint.domain.Mammal#jump()
	 */
	@Override
	public String jump() {
		String value="Dog is jumping...";
		System.out.println(value);
		return value;

	}

	/**
	 * The way of a canine is going to move
	 * @see com.yoiset.motionpoint.domain.Animal#move()
	 */
	@Override
	public String move() {
		return walk();
	}

	/**
	 * Walk.
	 */
	private String walk() {
		String value= "Dog is walking fours...";
		System.out.println("Dog is walking fours...");
		return value;

	}

	/** The way what a dog communicate
	 * @see com.yoiset.motionpoint.domain.Communicator#communicate()
	 */
	@Override
	public String communicate() {
		String value= "Dog is barking...";
		System.out.println(value);
		return value;
		
	}

}
