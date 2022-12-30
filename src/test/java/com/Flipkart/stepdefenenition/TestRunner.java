package com.Flipkart.stepdefenenition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(   features = " src\\test\\resources\\Features\\Tv.feature",
                       glue  = "com.Flipkart.stepdefenenition",
                       plugin ={"html:target","json:target/reports.json"},
                       monochrome= true,
                       dryRun=false
                    

		
		
		)
public class TestRunner {
}

