package com.qa.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features",
		glue="com.qa.automation.stepdefs",
		tags="",
		plugin = {"pretty",
				"html:target/html/htmlReport.html",
				"json:target/json/jsonReport.json"
		},
		monochrome = true,
		publish = true,
		dryRun=false
		)

public class TestRunner {
	
}
