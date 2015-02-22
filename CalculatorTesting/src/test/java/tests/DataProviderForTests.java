package tests;
import org.testng.annotations.DataProvider;


public class DataProviderForTests {
	
	@DataProvider(name="DifferentSums")
	public Object[][] sumsToTest(){
		return new Object[][]{new Object[]{2+5},new Object[]{-56+8},new Object[]{0+14}};
	}
	
	@DataProvider(name="DifferentSubstractions")
	public Object[][] subsToTest(){
		return new Object[][]{new Object[]{7-0}, new Object[]{0-7}, new Object[]{0-0},new Object[]{5-5}};
	}
	
	@DataProvider(name="DifferentMultip")
	public Object[][]multiToTest(){
		return new Object[][]{new Object[]{3*0}, new Object[]{0*3}, new Object[]{-9*5}, new Object[]{-5*(-4)}};
	}

}
