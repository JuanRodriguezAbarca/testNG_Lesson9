package tests;

import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

public class SimpleTest {
	
	@Test(enabled=true)
	public void simpleTest(){
		System.out.println("output from SimpleTest");
		assertTrue("The input was false", false);
	}

}
