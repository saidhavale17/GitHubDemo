package StepDefination;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dependencyPico.PicoTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	//driver is created in TestBase class.TestBase class object required to access TestBase elements 
	//i.e.driver which is returned by WebDriverManager
	//TestBase class object is created in PicoTest class
	//so driver is replaced by P.testbase.WebDriverManager()
	PicoTest P;
	public Hooks(PicoTest P)
	{
		this.P=P;
	}
	@After
	public void after() throws Exception
	{
		P.testbase.WebDriverManager().quit();
	}
	
	
}
