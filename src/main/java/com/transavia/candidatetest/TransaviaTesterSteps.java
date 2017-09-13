package com.transavia.candidatetest;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.WhenPageOpens;


public class TransaviaTesterSteps {

	WebDriver driver = null;

	//Navigate to home page and verify
    @Step                                                       
    public void NavigateToBrowser() throws InterruptedException {
    	
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.transavia.com/en-NL/home/");
		Thread.sleep(3000);
		assertTrue("We are not on the right page", driver.getTitle().equals("Transavia is the airline of choice for affordable flights!"));
        Thread.sleep(3000);
     
    }
   
    //Check the existence of the input fields
    @Step 
    public void Flightinputfields() throws InterruptedException {
    	System.out.println("Verifying the existence of the input fields...");
    	
    	int iCount = driver.findElements(By.id("routeSelection_DepartureStation-input")).size();
    	int yCount = driver.findElements(By.id("routeSelection_ArrivalStation-input")).size();
    	assertTrue("No DepartureStation entry found", iCount>0);
    	assertTrue("No ArrivalStation entry found", yCount>0);
    	Thread.sleep(3000);
    }
    
    //Click on submit button
    @Step
    public void SubmitSearch() throws InterruptedException {
    	System.out.println("Click on submit button...");
        driver.findElement(By.xpath("//*[@id=\"desktop\"]/section/div[3]/div/button")).click();
        Thread.sleep(3000);
        
    }
    
    //Check that we are redirected to Book a flight page
    @Step
    public void CheckBookingFlight() throws InterruptedException {
    System.out.println("Verifying that we are redirected to Book a flight page...");
    assertTrue("You are not redirected to Book flight page", driver.getTitle().equals("Book a flight"));
   
  	Thread.sleep(3000);
    }
  
	
}