package com.transavia.candidatetest;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;*/

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class TransaviaStepDefinitions {
	
	
	@Steps
	TransaviaTesterSteps TransaviaTester;
	@Steps
	TransaviaPassengerSteps TransaviaPassenger;


@Given("^I Navigate to Transavia Website$")
public void i_Navigate_to_the_browser() throws Throwable {
	TransaviaTester.NavigateToBrowser();
}



@When("^I confirm the existence of the input fields$")
public void Confirm_the_input_fields() throws Throwable {
	TransaviaTester.Flightinputfields();
}
@When("^click on SearchButton$")
public void Click_on_searchbutton() throws Throwable {
	TransaviaTester.SubmitSearch();
}
@Then("^I should be redirect to Book a flight page$")
public void Redirect_to_bookflight() throws Throwable {
	TransaviaTester.CheckBookingFlight();
}

@When("^I enter ([^\"]*) and ([^\"]*)and ([^\"]*) and ([^\"]*)$")
public void Enter_flight_dates(String Departure, String Arrival, String Outbounddate, String Inbounddate) throws Throwable {
	TransaviaPassenger.EnterFlightsDates(Departure, Arrival, Outbounddate, Inbounddate);
}

@Then("^I should be required to update the dates in case (.*?) is before (.*?)$")
public void Check_date_order(String Outbounddate, String Inbounddate) throws Throwable {
	TransaviaPassenger.CheckDatesCorrectness(Outbounddate, Inbounddate);
}

}
