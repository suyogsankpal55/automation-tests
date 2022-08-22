package com.suyog.driverFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.suyog.staticData.CommonSharedData;

public class DriverInstance {

	public static RemoteWebDriver driver;
	public enum brNames
	{
		CHROME,FIREFOX,EDGE;

	}

	public DriverInstance(String browserName)
	{

		brNames brName= brNames.valueOf(browserName.toUpperCase());
		switch (brName) {
		case CHROME:
			launchChromeBrowser();
			break;
		case FIREFOX:			
			break;

		default:
			break;
		}
	}

	private static void launchChromeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "e:\\Automation\\Tools\\drivers\\chromedriver.exe");
			System.out.println("Launching browser");
						System.out.println("Launching browser");

			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(CommonSharedData.APP_URL);
			Thread.sleep(1000);
			login();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(CommonSharedData.userName);;
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(CommonSharedData.password);;
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
