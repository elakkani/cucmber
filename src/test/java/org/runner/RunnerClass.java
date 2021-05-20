package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ari\\eclipse-workspace\\Cucumberd1\\src\\test\\resources",glue="org.stepde",monochrome=true,dryRun=false)
public class RunnerClass {

}
