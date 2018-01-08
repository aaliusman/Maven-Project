package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Util.Lib;

public class BillingInfo extends Lib {

	public static void info(WebDriver driver) throws InterruptedException
	{
		entertxt(driver, ".//*[@id='billing:firstname']").sendKeys("John");
		Thread.sleep(1000);
		
		entertxt(driver,".//*[@id='billing:lastname']").sendKeys("King");
		Thread.sleep(1000);
		entertxt(driver,".//*[@id='billing:street1']").sendKeys("800 Trenon Rd");
		entertxt(driver, ".//*[@id='billing:city']").sendKeys("Langhorne");
		Thread.sleep(1000);
		Select country= new Select(driver.findElement(By.xpath(".//*[@id='billing:country_id']")));
		country.selectByVisibleText("United States");
		
		Select region= new Select(driver.findElement(By.xpath(".//*[@id='billing:region_id']")));
		region.selectByVisibleText("Pennsylvania");
		
		entertxt(driver, ".//*[@id='billing:postcode']").sendKeys("19047");
		Thread.sleep(1000);
		entertxt(driver,".//*[@id='billing:customer_password']").sendKeys("Abcd12345");
		entertxt(driver,".//*[@id='billing:confirm_password']").sendKeys("Abcd12345");
		
		clickElement(driver,".//*[@id='co-billing-form']/fieldset/ul/li[2]/div[1]/label").click();
		Thread.sleep(1000);
		clickElement(driver,".//*[@id='billing-buttons-container']/button").click();
		
	}
	
	
	
}
