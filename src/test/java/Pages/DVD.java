package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class DVD extends Lib {
	
	public static void clickdvd(WebDriver driver) throws IOException
	{
		clickElement(driver, readprop(driver, "cldvd")).click();
	}
	public static void addcart(WebDriver driver) throws IOException
	{
		clickElement(driver, readprop(driver, "adcart")).click();
	}
}
