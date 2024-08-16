package com.codetru.Demo.Amazon.pages;

import static com.OpenMRS.keywords.WebUI.*;
import org.openqa.selenium.By;
import com.codetru.project.cica.CommonPageCICA;


public class C_Tumbler_Page extends CommonPageCICA{


	private By bestsellers_tab = By.xpath("//a[.='Best Sellers']");
	private By tumbler = By.xpath("//img[@alt=\"Stanley Quencher H2.0 FlowState Stainless Steel Vacuum Insulated "
			+ "Tumbler with Lid and Straw for Water, Iced Tea or Coffee\"]") ;
	private By Add_to_cart_btn = By.id("add-to-cart-button") ;
//	private By no_thanks = By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']");
//	private By Added_to_cart_text = By.xpath("(//h4[text() = 'Added to Cart'])[2]");

	public void AddTumbler() throws Exception {
		sleep(2);
		clickElement(bestsellers_tab);
		sleep(1.5);
		
		clickElement(tumbler);        

		sleep(3);
		clickElement(Add_to_cart_btn);

		sleep(3);
		
		
	}



}



