package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import app.Calculator;

public class SimpleOrderTest {
	
	private double firstValue=2;
	private double secondValue=3;
	
	private Calculator calculator;
	
	@BeforeClass(description="Intialaizng")
	public void initCalculator(){
		calculator=new Calculator();
	}
	
	@Test(description="Suma", priority=2)
	public void checkAddition(){
		Assert.assertEquals(firstValue+secondValue, calculator.suma(firstValue, secondValue));;
	}
	
	@Test(description="Substraction",priority=0)
	public void checkResta(){
		Assert.assertEquals(firstValue-secondValue, calculator.resta(firstValue, secondValue));
	}
	
	
	@Test(description="Multiplication", dependsOnMethods="checkAddition", alwaysRun=true)
	public void checkMultip(){
		Assert.assertEquals(firstValue*secondValue, calculator.multiplication(firstValue, secondValue));
	}
	

}
