package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feature",glue="StepDefination",monochrome=true,
                plugin={"html:target/cucumber.html","rerun:target/failed.txt"})
public class VegetableRunner extends AbstractTestNGCucumberTests {
   /* //overriding method from parent class
	@Override
	//scenarios will be triggered in parallel by by setting parallel value true
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		//scenarios is method present in AbstractTestNGCucumberTests
		//it is accessed with super because its method of parent class
		//By calling this method and setting parallel attribute true we can run scenarios in parallel
		return super.scenarios();
	}*/
	
	
}
