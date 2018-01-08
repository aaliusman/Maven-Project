package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class Ch_Method extends Lib {
	
	public static void eml(WebDriver driver) throws IOException
	{
		entertxt(driver, readprop(driver, "email")).sendKeys("bravo1516@hotmail.com");
	}
	public static void clickno(WebDriver driver) throws InterruptedException, IOException
	{	Thread.sleep(3000);
		clickElement(driver, readprop(driver, "clno")).click();
	}
	public static void conti(WebDriver driver) throws IOException
	{
		clickElement(driver, readprop(driver, "clcont")).click();
		System.out.println("Page Title"+printtitle(driver));
	}

}
