package com.codetru.Demo.Amazon.pages;

import static com.OpenMRS.keywords.WebUI.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.OpenMRS.driver.DriverManager;
import com.codetru.project.cica.CommonPageCICA;

public class E_DeleteCart_Page extends CommonPageCICA {


	private By Cart = By.xpath("//span[normalize-space()='Cart']");
	private By Delete_Btn = By.xpath("(//span[@data-action='sc-item-action'])[1]") ;
	private By EmptyCart = By.xpath("//h1[@class = 'a-spacing-mini a-spacing-top-base']");
	private By checkout = By.name("proceedToRetailCheckout") ;
	private By logo = By.xpath("//div[@id='banner-image']");
	private By return_to_cart = By.xpath("(//a[normalize-space()='Return to Cart'])[2]");

	//Using it for Fail case
	private By Fail = By.xpath("add-to-cart-button") ;

	public void Delete_Items() throws Exception {

		clickElement(Cart);

//		Thread.sleep(3000);
//		driver.navigate().refresh();
		sleep(5);
		clickElement(Delete_Btn);
		sleep(2);

		DriverManager.getDriver().navigate().refresh();
		sleep(5);
		clickElement(Delete_Btn);
		
		sleep(3);
		clickElement(checkout);

		sleep(3);
		clickElement(logo);
		
		sleep(3);
		clickElement(return_to_cart);
		sleep(2);
		
		
		DriverManager.getDriver().navigate().refresh();
		sleep(3);
		clickElement(Delete_Btn);
		
	}

	public void Fail_Case() throws Exception {

		verifyElementVisible(Fail);

	}


}
