package StepDefination;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.ObjectFactory;
import PageObjects.OfferPageObjects;
import dependencyPico.PicoTest;
import io.cucumber.java.en.Then;

public class VegetableOfferPageStepDef {
	//public WebDriver driver;
	PicoTest P; 
	public ObjectFactory Objectfactory;
	public VegetableOfferPageStepDef(PicoTest P)
	{
		this.P=P;
	}
	@Then("^User searched for same shortname (.+) in offers page to check if product exist$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String product) throws Exception {
		//OfferPageObjects Opobj=new OfferPageObjects(P.driver);
		//Objectfactory =new ObjectFactory(P.driver);
		//OfferPageObjects Opobj=Objectfactory.Vegofferpageobj();
		OfferPageObjects Opobj=P.Objectfactory.Vegofferpageobj();
		//P.driver.findElement(By.linkText("Top Deals")).click();
		Opobj.topdealsclick();
	   Set<String> windows=P.testbase.WebDriverManager().getWindowHandles();
	   String parentwindow=P.testbase.WebDriverManager().getWindowHandle();
	   for(String w:windows)
	   {
		   if(!w.equals(parentwindow))
		   {
			   P.testbase.WebDriverManager().switchTo().window(w);
			  // P.driver.findElement(By.id("search-field")).sendKeys(product);
			   Opobj.Searchproduct(product);
			   Thread.sleep(500);
			   //WebElement table=P.driver.findElement(By.tagName("table"));
			   WebElement table=Opobj.table();
			   //List <WebElement> rows= P.driver.findElement(By.tagName("tr"));
			     List <WebElement> rows= Opobj.getrow(table);
			   for(WebElement row:rows)
			   {
				 //List <WebElement> rows= P.driver.findElement(By.tagName("td"));
				   List <WebElement> cols= Opobj.getcol(row);
				
				   for(WebElement col:cols)
				   {
					   System.out.println("Product appeared on screen is: "+col.getText());
				   }
				  
				   
			   }P.testbase.WebDriverManager().close();
		   }
	   }
	   
	}
}
