package StepDefination;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.MainPageObjects;
import PageObjects.ObjectFactory;
import dependencyPico.PicoTest;
import dependencyPico.TestBase;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class VegetableMainPageStepDef {
	//WebDriver driver;
	PicoTest P;
	ObjectFactory Objectfactory;
	public VegetableMainPageStepDef(PicoTest P)
	{
		this.P=P;
	}
	
	@Given("User is on Greencart landing page")
	public void user_is_on_greencart_landing_page() {
		//TestBase testbase=new TestBase();
		//testbase.WebDriverManager();
	}
	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String product) throws Exception {
		//MainPageObjects Mobj=new MainPageObjects(P.driver);
		//Objectfactory =new ObjectFactory(P.driver);
		//MainPageObjects Mobj=Objectfactory.VegemainpageObj();
		MainPageObjects Mobj=P.Objectfactory.VegemainpageObj();
		Mobj.SearchItem(product);
	    Thread.sleep(1000);
	    String s=Mobj.ActualProduct().split("-")[0].trim();
	    System.out.println("Product appeared on screen is: "+s);
	}
	
	@When ("User increases quantity to 2 and do add to cart")
	public void And_User_increases_quantity_to_2_and_do_add_to_cart() throws Exception
	{
		//driver.finElement(By.cssSelector("a.increment")).click();
		//MainPageObjects Mobj = new MainPageObjects(P.driver);
		//ObjectFactory Mobj= new ObjectFactory(P.driver);
		MainPageObjects Mobj=P.Objectfactory.VegemainpageObj();
		Mobj.IncreamentQuantity();
		Thread.sleep(500);
		//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Mobj.AddToCart();
	}
	
}
