package com.kata.axileo;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"classpath:account.feature"},monochrome=true)
public class RunCucumberTest { }
