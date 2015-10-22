package com.yoiset.motionpoint.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Human. Represents human being
 */
public class Human extends Mammal implements Communicator {

	/**
	 * Constructor for Human. Blood Temperature initialized on 70
	 */
	public Human() {
		setBloodTemperature(70);
	}

	/**
	 * The way of a Human jumps
	 * 
	 * @see com.yoiset.motionpoint.domain.Mammal#jump()
	 */
	@Override
	public String jump() {
		String value = "Human is jumping in 2 feet";
		System.out.println(value);
		return value;

	}

	/**
	 * The way of a human is going to move
	 * 
	 * @see com.yoiset.motionpoint.domain.Animal#move()
	 */
	@Override
	public String move() {
		return walk();

	}

	private String walk() {
		String value = "Human is walking in 2 feet";
		System.out.println(value);
		return value;
	}

	/**
	 * The way what a human communicate
	 * 
	 * @see com.yoiset.motionpoint.domain.Communicator#communicate()
	 */
	@Override
	public String communicate() {
		String value = "Human is talking...";
		System.out.println(value);
		return value;
	}

}
