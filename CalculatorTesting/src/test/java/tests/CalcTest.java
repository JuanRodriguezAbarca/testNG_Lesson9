package tests;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import app.Calculator;

public class CalcTest {
	
	public static final double DELTA=0.01;
	public static final double IN_MEMORY=2.;
	
	private Calculator calculator;
	
	@BeforeClass(description="Initialazing")
	public void initCalculator(){
		System.out.println("Starting");
		calculator=new Calculator();
	}
	
	@AfterClass(description="Cleaning Memory")
	public void cleaner(){
		System.out.println("Memory Cleared");
	}
	
	@Test(description="Division simple check")
	public void checkDivision(){
		System.out.println("Division Simple Check");
		Assert.assertEquals(calculator.division(15, 5),3,DELTA,"15/5 operation is wrong");
	}
	
	@Test(description="Save to memory")
	public void setInToMemory(){
		calculator.setInMemory(IN_MEMORY);
	}
	
	@Test(dependsOnMethods="setInToMemory", description="Check division stored in memory value")
	public void checkDivisionWithInMemoryValue(){
		double div = 10d;
		Assert.assertEquals(div/IN_MEMORY,
				calculator.division(div, calculator.getFromMemory()),DELTA,"Wrong Division result");
	}
	
	@Test(dependsOnMethods="setInToMemory", description="Check division with \"In Memory\"")
	public void checkDivisionWithInMemory(){
		calculator.setInMemory(IN_MEMORY);
		double div = 10d;
		Assert.assertEquals(div/IN_MEMORY,
				calculator.division(div, calculator.getFromMemory()),"Error with In Memory variable");
	}
	
	
	
	

}
