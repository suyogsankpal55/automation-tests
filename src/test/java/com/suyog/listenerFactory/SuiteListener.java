package com.suyog.listenerFactory;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.suyog.staticData.CommonSharedData;


public class SuiteListener implements ISuiteListener {

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		CommonSharedData.APP_URL=suite.getParameter("appURL");
		CommonSharedData.browserName=suite.getParameter("browserName");
		CommonSharedData.userName=suite.getParameter("userName");
		CommonSharedData.password=suite.getParameter("password");
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

}
