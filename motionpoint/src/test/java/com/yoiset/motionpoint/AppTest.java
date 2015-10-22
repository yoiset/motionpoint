package com.yoiset.motionpoint;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.yoiset.motionpoint.domain.Animal;
import com.yoiset.motionpoint.domain.Canine;
import com.yoiset.motionpoint.domain.Communicator;
import com.yoiset.motionpoint.domain.Human;
import com.yoiset.motionpoint.domain.Snake;

/**
 * Unit test for simple App.
 */
public class AppTest{

	private static List<Animal> animals;
	private static List<Communicator> communicators;

	/**
	 * Initializing list before runs any Test 
	 */
	@BeforeClass
	public static void setUpBeforeClass() {
		animals = new ArrayList<>();
		communicators = new ArrayList<>();

		Animal aSnake = new Snake();
		Animal aDog = new Canine();
		Animal aPerson = new Human();

		animals.add(aSnake);
		animals.add(aDog);
		animals.add(aPerson);

		Communicator lassie = new Canine();
		Communicator obama = new Human();

		communicators.add(lassie);
		communicators.add(obama);
		communicators.add((Communicator) aDog);
		communicators.add((Communicator) aPerson);

	}

	/**
	 * Checking behavioral polymorphism
	 */
	@Test
	public void testAnimal() {
		for (Animal animal : animals) {
			if (animal instanceof Snake) {
				assertEquals(animal.move(), "Snake is dragging...");
				assertEquals(animal.getBloodTemperature(), 40);

			} else if (animal instanceof Canine) {
				assertEquals(animal.move(), "Dog is walking fours...");
				assertEquals(((Canine) animal).jump(), "Dog is jumping...");
				assertEquals(animal.getBloodTemperature(), 60);

			} else if (animal instanceof Human){
				assertEquals(animal.move(), "Human is walking in 2 feet");
				assertEquals(((Human) animal).jump(), "Human is jumping in 2 feet");
				assertEquals(animal.getBloodTemperature(), 70);
			}

		}

	}
	
	/**
	 * Checking behavioral polymorphism
	 */
	@Test
	public void testComunicator(){
		for (Communicator comm : communicators) {
			if(comm instanceof Human){
				assertEquals(comm.communicate(), "Human is talking...");
			}else if(comm instanceof Canine){
				assertEquals(comm.communicate(), "Dog is barking...");
			}
		}
	}
}
