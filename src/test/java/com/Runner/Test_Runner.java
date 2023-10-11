package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Vivek\\Desktop\\WorkSpace\\limeRoad\\src\\test\\java\\com\\feature\\lime.feature",
                glue = "com.StepDefinition",
                monochrome = true,
                dryRun = false,
                strict = true,
                tags = "@SmokeTest",
                plugin = {"pretty",
                		"json:resour/lime.json",
                		"html:res/limeRoad.html",
                		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                })
public class Test_Runner extends BaseClass {

	@BeforeClass
	public static void launch()
	{
		browserLaunch("Chrome");
	}
}
