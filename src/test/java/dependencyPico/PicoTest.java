package dependencyPico;

import org.openqa.selenium.WebDriver;

import PageObjects.ObjectFactory;

public class PicoTest {
	public WebDriver driver;
	public ObjectFactory Objectfactory;
	public TestBase testbase;

	public PicoTest() throws Exception
	{
		testbase=new TestBase();
		//Objectfactory= new ObjectFactory(driver);
		Objectfactory= new ObjectFactory(testbase.WebDriverManager());
	}
	
	

}
