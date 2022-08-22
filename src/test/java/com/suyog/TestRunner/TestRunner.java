package com.suyog.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"classpath:Fetaures"}
		,glue={"com.suyog.StepDef"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
