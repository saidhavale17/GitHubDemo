package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageObjects {
	WebDriver driver;
    public MainPageObjects(WebDriver driver)
    {
    	this.driver=driver;
    }
	By Search=By.xpath("//input[@type='search']");
	By ProductName=By.cssSelector("h4.product-name");
	By increament =By.cssSelector("a.increment");
	By AddToCart=By.xpath("//button[text()='ADD TO CART']");
	public void SearchItem(String name)
	{
		driver.findElement(Search).sendKeys(name);
	}
	
	public String ActualProduct()
	{
		return driver.findElement(ProductName).getText();
	}
	
	public void IncreamentQuantity()
	{
		driver.findElement(increament).click();
	}
	
	public void AddToCart()
	{
		driver.findElement(AddToCart).click();
	}
}
