package com.transavia.candidatetest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		             	 features = {"src/test/resources/testerVerify.feature",
		             			//"src/test/resources/potentialPassenger.feature"
		             	 }
		            
		        )
public class RunnerTest {

}


