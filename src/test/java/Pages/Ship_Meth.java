package Pages;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class Ship_Meth extends Lib{

	public static void Shpmeth(WebDriver driver)
	{
		clickElement (driver, ".//*[@id='shipping-method-buttons-container']/button").click();
	}
}
