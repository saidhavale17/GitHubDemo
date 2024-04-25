package StepDefination;

import org.openqa.selenium.By;

import PageObjects.CheckOutObjects;
import PageObjects.ObjectFactory;
import dependencyPico.PicoTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VegetableCheckOut {
	
	 PicoTest P;
	 public VegetableCheckOut(PicoTest P)
	 {
		 this.P=P;
		 
	 }
	 
	@When("User procced to checkout")
	public void user_procced_to_checkout() throws Exception {
		//P.driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		// P.driver.findElement(By.xpath("//p[@class='product-name']")).click();
		//---------------------------------------------------------------------
		//CheckOutObjects Coobj= new CheckOutObjects(P.driver);
		//Coobj.cart();
		//Coobj.checkout();
		//---------------------------------------------------------------------
		//ObjectFactory Coobj = new ObjectFactory(P.driver);
		CheckOutObjects Coobj=P.Objectfactory.VegCheckoutpageobj();
		Coobj.cart();
	    Coobj.checkout();
	    Thread.sleep(1000);
	    
	}

	@Then("Verify product name is same to main page")
	public void verify_product_name_and_quantity_are_same_to_main_page() {
		CheckOutObjects Coobj=P.Objectfactory.VegCheckoutpageobj();
	    String actual="Tomato - 1 Kg";
	    //String expected= driver.findElement(By.xpath("//p[text()='Tomato - 1 Kg']")).getText();
	   String expected=Coobj.productname();
	   
	    if(actual.equals(expected)  )
	    	System.out.println("Product  is same as main page");
	    else
	    	System.out.println("Product  is not same as main page");
	    
	}

	@Then("verify if apply and place order buttons are present on page")
	public void verify_if_apply_and_place_order_buttons_are_present_on_page() {
		
		CheckOutObjects Coobj=P.Objectfactory.VegCheckoutpageobj();
		boolean ApplyPresent= Coobj.Apply();
	    boolean PlaceOrderPresent=Coobj.PlaceOrder();
	    if(ApplyPresent==true)
	    {
	    	System.out.println("Apply button is present on page");
	    }
	    if(PlaceOrderPresent==true)
	    {
	    	System.out.println("PlaceOrder button is present on page");
	    }
	}


}
