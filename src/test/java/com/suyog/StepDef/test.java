package com.suyog.StepDef;

import org.openqa.selenium.WebDriver;

import com.suyog.driverFactory.DriverInstance;
import com.test.PageInfo.testInfo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {

	WebDriver driver;
	public static testInfo t;
	public test(){
		driver= DriverInstance.driver;
		t= new testInfo(driver);
	}


	@Given("^User is on login page$")
	public void user_is_on_login_page()  {
		try {
          System.out.println("aaa"+driver.getCurrentUrl());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("^Enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
		try {

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {
		try {

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Then("^User should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		try {

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}



}
