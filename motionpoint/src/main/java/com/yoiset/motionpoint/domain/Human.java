package com.yoiset.motionpoint.domain;


// TODO: Auto-generated Javadoc
/**
 * The Class Human. Represents human being 
 */
public class Human extends Mammal implements Communicator{

	/**
	 * Constructor for Human. Blood Temperature initialized on 70
	 */
	public Human() {
		setBloodTemperature(70);
	}

	/** The way of a Human jumps
	 * @see com.yoiset.motionpoint.domain.Mammal#jump()
	 */
	@Override
	public void jump() {
		System.out.println("Human is jumping in 2 feet");
		
	}

	/** The way of a human is going to move
	 * @see com.yoiset.motionpoint.domain.Animal#move()
	 */
	@Override
	public void move() {
		walk();
		
	}
	
	private void walk(){
		System.out.println("Human is walking in 2 feet");
	}

	/** The way what a human communicate
	 * @see com.yoiset.motionpoint.domain.Communicator#communicate()
	 */
	@Override
	public void communicate() {
		System.out.println("Human is talking...");
	}

}
