package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Util.Lib;

public class Payment extends Lib{
	public static void Payinfo(WebDriver driver) throws InterruptedException
	
	{	driver.switchTo().frame("pbridge_iframe");
		
		//entertxt(driver,".//*[@id='cc_number_paymentech']").sendKeys("King");
		entertxt(driver, "//input[@name='paymentech[cc_number]']").sendKeys("4025852002588520");
		Thread.sleep(3000);
		
		Select m= new Select(driver.findElement(By.xpath(".//*[@id='cc_expiration_month_paymentech']")));
		m.selectByVisibleText("05 - May");
		Thread.sleep(3000);
		Select y= new Select(driver.findElement(By.xpath("//select[@id='cc_expiration_year_paymentech']")));		
		y.selectByIndex(3);
		Thread.sleep(2000);
		clickElement(driver,".//*[@id='paymentech_form']/div/button").click();
		sleep(driver,2);
		//System.out.println(driver.findElement(By.xpath(".//*[@id='msg_cc_number_paymentech']")).getText());
		driver.switchTo().defaultContent();
		
	}

}
