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
	public void jump() {
		System.out.println("Dog is jumping...");

	}

	/**
	 * The way of a canine is going to move
	 * @see com.yoiset.motionpoint.domain.Animal#move()
	 */
	@Override
	public void move() {
		walk();

	}

	/**
	 * Walk.
	 */
	private void walk() {
		System.out.println("Dog is walking fours...");

	}

	/** The way what a dog communicate
	 * @see com.yoiset.motionpoint.domain.Communicator#communicate()
	 */
	@Override
	public void communicate() {
		System.out.println("Dog is barking...");
		
	}

}
