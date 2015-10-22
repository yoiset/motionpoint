package com.yoiset.motionpoint.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionPointException.
 * Sample of redefinition for possible motion point exceptions 
 */
public class MotionPointException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new motion point exception.
	 */
	public MotionPointException() {
		super();
	}

	/**
	 * Instantiates a new motion point exception.
	 * Adding some implementation for motion point specification
	 * @param message the message
	 */
	public MotionPointException(String message) {
		super(message);
		System.out.println("Exception at " + message);

	}
	
	
	/**
	 * Instantiates a new motion point exception.
	 * Adding some implementation for motion point specification
	 * @param e the exception
	 */
	public MotionPointException(Exception e) {
		super(e);
		if(e == null) return;
		System.out.println("Exception at " + e.getMessage());

	}
	
	

}
