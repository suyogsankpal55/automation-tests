package com.test.PageInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class testInfo {

	
	public testInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
