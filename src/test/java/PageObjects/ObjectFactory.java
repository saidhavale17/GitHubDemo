package PageObjects;

import org.openqa.selenium.WebDriver;

public class ObjectFactory {
	public WebDriver driver;
	MainPageObjects Mobj;
	OfferPageObjects Opobj;
	CheckOutObjects Coobj;
	
	 public ObjectFactory(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public MainPageObjects VegemainpageObj()
	{
		Mobj=new MainPageObjects(driver);
		return Mobj;
	}
	
	public OfferPageObjects Vegofferpageobj()
	{
		Opobj= new OfferPageObjects(driver);
		return Opobj;
	}
	
	public CheckOutObjects VegCheckoutpageobj()
	{
		Coobj= new CheckOutObjects(driver);
		return Coobj;
	}

}
