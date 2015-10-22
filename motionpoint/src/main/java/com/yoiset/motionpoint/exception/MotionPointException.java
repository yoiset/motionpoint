package com.yoiset.motionpoint.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionPointException.
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
	 *
	 * @param message the message
	 */
	public MotionPointException(String message) {
		super(message);
		System.out.println("Exception at " + message);

	}

}
