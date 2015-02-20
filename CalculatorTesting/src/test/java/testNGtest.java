import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNGtest {
	
	WebDriver driver = new FirefoxDriver();
	
//	@BeforeClass
//	public void opener(){
//		driver.get("https://www.google.es/");
//	}
//	
//	@AfterClass
//	public void closer(){
//		driver.close();
//	}
	
	@Test(dataProvider="execute-strings")
	public void executeOperation(String s){
		System.out.println("execute "+s);
	}
	
	@DataProvider(name="execute-strings")
	public Object[][] resultMethod(){
		return new Object[][]{new Object[]{"2*2"}, new Object[]{"3+5"}};
	}
	
	@Test
	public void dataProviderTest(){
		
	}

}
