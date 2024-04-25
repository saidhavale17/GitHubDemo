package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutObjects {
	WebDriver driver;

	

	public CheckOutObjects(WebDriver driver) {
		this.driver=driver;
	}



	By Cart=By.xpath("//img[@alt='Cart']");
	By checkout=By.xpath("//button[text()='PROCEED TO CHECKOUT'] ");
	By productname= By.xpath("//p[text()='Tomato - 1 Kg']");
	By Apply=By.xpath("//button[text()='Apply']");
	By PlaceOrder=By.xpath("//button[text()='Place Order']");
	public void cart()
	{
		driver.findElement(Cart).click();
	    
	}
	
	public void checkout()
	{
		driver.findElement(checkout).click();
	}
	
	public String productname()
	{
		String product=driver.findElement(productname).getText();
		return product;
	}
	
	public boolean Apply() 
	{
		boolean present=driver.findElement(Apply).isDisplayed();
		return present;
	}
	public boolean PlaceOrder() 
	{
		boolean present=driver.findElement(PlaceOrder).isDisplayed();
		return present;
	}
	
	
	
	
}
