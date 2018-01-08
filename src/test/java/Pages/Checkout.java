package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class Checkout extends Lib {
	public static void checkout(WebDriver driver) throws IOException
	{
		clickElement(driver, readprop(driver, "clco")).click();
		
		System.out.println(printtitle(driver));
		
	}

}
