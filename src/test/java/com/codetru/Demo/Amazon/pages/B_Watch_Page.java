package com.codetru.Demo.Amazon.pages;

import static com.OpenMRS.keywords.WebUI.*;
import org.openqa.selenium.By;
import com.codetru.project.cica.CommonPageCICA;

public class B_Watch_Page extends CommonPageCICA{


	private By Search_bar = By.xpath("//input[@id='twotabsearchtextbox']");
	private By search_btn = By.xpath("//input[@id='nav-search-submit-button']");
	private By watch = By.xpath("(//span[@data-component-type='s-product-image'])[2]");
	private By Add_to_cart_btn = By.id("add-to-cart-button");
	private By no_thanks = By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']");
	
	public void Add_Watch_To_The_Cart() throws Exception {

		setText(Search_bar, "apple watch");

		clickElement(search_btn);

		clickElement(watch);

		clickElement(Add_to_cart_btn);

		sleep(1.5);
		clickElement(no_thanks);
	}




}



