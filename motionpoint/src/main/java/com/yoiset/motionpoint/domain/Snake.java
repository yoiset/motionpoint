package com.yoiset.motionpoint.domain;

/**
 * The Class Snake. Represents those reptiles who use dragging method locomotion
 */
public class Snake extends Reptile {

	/**
	 * Constructor for Snake. Blood Temperature initialized on 40
	 */
	public Snake() {
		setBloodTemperature(40);
	}

	/**
	 * Locomotion as a snake
	 */
	@Override
	public String move() {
		return drag();
	}

	/**
	 * The way of the snake move
	 */
	private String drag() {
		String value="Snake is dragging...";
		System.out.println(value);
		return value;
	}

}
