package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.BillingInfo;
import Pages.Ch_Method;
import Pages.Checkout;
import Pages.DVD;
import Pages.Home;
import Pages.Payment;
import Pages.Ship_Meth;
import Util.Lib;

public class Test {
	
	static WebDriver driver;
	@Before
	public void before() throws InterruptedException {
		System.out.println("this is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Maven3\\chromedriver.exe");

		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.thegreatcourses.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
	}

	@After
	public void after() throws InterruptedException {
		driver.manage().deleteAllCookies();
		Thread.sleep(6000);
		driver.close();

}
	@org.junit.Test	
	public void Testing() throws InterruptedException, IOException {
		
		try {
		
		System.out.println("Testing");
		Home hm=new Home();
		Thread.sleep(2000);
		hm.TheGreat(driver);
		
		hm.SearchMath(driver);
		hm.clickmath(driver);
		Thread.sleep(2000);
		
		DVD dv= new DVD();
		dv.clickdvd(driver);
		Thread.sleep(2000);
		dv.addcart(driver);
		
		Checkout co=new Checkout();
		co.checkout(driver);
		
		Thread.sleep(3000);
		Ch_Method cm=new Ch_Method();
		cm.eml(driver);
		cm.clickno(driver);
		Thread.sleep(2000);
		cm.conti(driver);
		
		Thread.sleep(2000);
		BillingInfo bi=new BillingInfo();
		bi.info(driver);
		Thread.sleep(2000);
		Ship_Meth sm=new Ship_Meth();
		sm.Shpmeth(driver);
		
		Thread.sleep(2000);
		Payment p=new Payment();
		p.Payinfo(driver);}
		catch(Exception e) {
			Lib.screenshot(driver);
		}
		
	}
}
