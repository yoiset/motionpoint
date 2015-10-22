package com.yoiset.motionpoint;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.yoiset.motionpoint.domain.Animal;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    
	private List<Animal> animals;
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    
    @BeforeClass
    public void init(){
    	
    }
    

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        assertTrue( true );
    }
}
