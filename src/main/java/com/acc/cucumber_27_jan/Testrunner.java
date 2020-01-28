package com.acc.cucumber_27_jan;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature"
                 ,glue= {"step_definition"}
                 )


public class Testrunner {

	
}
