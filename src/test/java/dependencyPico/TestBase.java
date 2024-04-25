package dependencyPico;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManager() throws Exception 
	{
		//line 21 needs input in input stream format so we are creating object of Fileinputstream class
		//Passing path as parameter 
		//To run code on any other system we are using 
		//System.getProperty("user.dir") it equals to C:\Users\DELL\eclipse-workspace\SeleAutomation
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src/test//Resources//Global.properties");
		//"Properties" class has ability to read .properties files so we have created object of that class.
		//At this stage it dont know where is .properties file
		Properties prop=new Properties();
		//to give knowledge to prop and access to .properties file below format is used.
		prop.load(fis);
		String URL=prop.getProperty("QURL");
		
		if(driver==null) 
		{
		if(prop.getProperty("browser").equals("Chrome")) 
		 {
			
			System.setProperty("webdriver.chrome.driver","/Users/DELL/Downloads/Selenium/chromedriver.exe");
			driver=new ChromeDriver();
			
			
		 }
		 if(prop.getProperty("browser").equals("Firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver","/Users/DELL/Downloads/Selenium/chromedriver.exe");
			driver=new FirefoxDriver();
			
		}
		 driver.get(URL);
		}
		return driver;
	}

}
