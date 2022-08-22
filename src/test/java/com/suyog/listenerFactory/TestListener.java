package com.suyog.listenerFactory;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.suyog.driverFactory.DriverInstance;
public class TestListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		new DriverInstance(context.getCurrentXmlTest().getParameter("browserName"));
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		if(DriverInstance.driver!=null)
		{
			DriverInstance.driver.quit();
		}
	}

}
