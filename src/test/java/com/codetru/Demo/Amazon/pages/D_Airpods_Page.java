package com.codetru.Demo.Amazon.pages;

import static com.OpenMRS.keywords.WebUI.clickElement;
import static com.OpenMRS.keywords.WebUI.setText;
import static com.OpenMRS.keywords.WebUI.sleep;

import org.openqa.selenium.By;
import com.OpenMRS.driver.DriverManager;
import com.codetru.project.cica.CommonPageCICA;

public class D_Airpods_Page extends CommonPageCICA {


	private By  Search_bar= By.xpath("//input[@id='twotabsearchtextbox']");
	private By  search_btn= By.xpath("//input[@id='nav-search-submit-button']");
	private By  apple_airpods= By.xpath("(//span[@data-component-type='s-product-image'])[1]");
	private By  Add_to_cart_btn= By.id("add-to-cart-button");
	private By  no_thanks= By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']");


	public void Add_Airpods() throws Exception {

		setText(Search_bar, "apple airpods");

		clickElement(search_btn);

		clickElement(apple_airpods);

		clickElement(Add_to_cart_btn);
		sleep(1.5);

		if(!DriverManager.getDriver().findElement(no_thanks).isDisplayed()) {
			System.out.println("No thanks button is not displayed");
		}else if(DriverManager.getDriver().findElement(no_thanks).isDisplayed()) {
			clickElement(no_thanks);
		}

		sleep(2);

	}

}
