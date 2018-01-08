package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Home extends Lib {
	
	public static void TheGreat(WebDriver driver)
	{
		WebElement hmpage=driver.findElement(By.xpath(".//*[@id='top']/div[2]/div/div/div[4]/div[1]/div[2]/a"));
		System.out.println(hmpage.getText());
	}
	
	public static void SearchMath(WebDriver driver) throws InterruptedException, IOException
	{	
		WebElement search=driver.findElement(By.xpath(readprop(driver, "srh")));
		Thread.sleep(2000);
		search.sendKeys("Math zero to infinity");
	}

	public static void clickmath(WebDriver driver) throws IOException
	{	clickElement(driver, readprop(driver, "clmt")).click();
		//driver.findElement(By.xpath(".//*[@id='search_autocomplete']/ul/li[3]/a")).click();
	}
}
