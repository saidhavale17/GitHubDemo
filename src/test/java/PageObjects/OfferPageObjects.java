package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferPageObjects {
	WebDriver driver;
	public OfferPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By TopDeals=By.linkText("Top Deals");
	By Search= By.id("search-field");
	By Table=By.tagName("table");
	By Row= By.tagName("tr");
	By col= By.tagName("td");
	
	public void topdealsclick()
	{
		driver.findElement(By.linkText("Top Deals")).click();
	}

	public void Searchproduct(String product)
	{
		 driver.findElement(By.id("search-field")).sendKeys(product);
	}
	
	public WebElement table()
	{
		WebElement Table=driver.findElement(By.tagName("table"));
		return Table;
	}
	public List<WebElement> getrow(WebElement table)
	{
		 List<WebElement> Row=table.findElements(By.tagName("tr"));
		 return Row;
	}
	public List<WebElement> getcol(WebElement row)
	{
		 List<WebElement> Col=row.findElements(By.tagName("tr"));
		 return Col;
	}
}
