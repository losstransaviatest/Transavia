package com.transavia.candidatetest;

import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;


public class TransaviaPassengerSteps {

	WebDriver driver = null;
	
	
   
    //Just enter values like airports and dates
    @Step 
    public void EnterFlightsDates(String Departure, String Arrival, String Outbounddate, String Inbounddate) throws InterruptedException {
    	System.out.println("Entering values in the input fields..."+ Departure+", "+Arrival+ ", "+Outbounddate+", "+Inbounddate );
    	System.out.println("Hereunder should be the code implemented to enter datas");
//    	driver.findElement(By.xpath("//ol[@class='results']/li[contains(.,"+Departure+")]")).click();
//    	((WebElement) driver.findElements(By.id("routeSelection_ArrivalStation-input"))).sendKeys(Arrival);
//    	((WebElement) driver.findElements(By.id("dateSelection_OutboundDate-datepicker"))).sendKeys(Outbounddate);
//    	((WebElement) driver.findElements(By.id("dateSelection_IsReturnFlight-datepicker"))).sendKeys(Inbounddate);
//    	
    	Thread.sleep(3000);
    }
    
        
    //Check that we are redirected to Book a flight page or to required to correct the entered flight dates
    @Step
    public void CheckDatesCorrectness(String Outbounddate, String Inbounddate) throws InterruptedException, ParseException {
    System.out.println("Checking if dates are correct before redirecting...");
    
   
     DateFormat fmt = new SimpleDateFormat("dd MMM yyyy");
     Date myinbounddate = fmt.parse(Inbounddate);
     Date myoutbounddate = fmt.parse(Outbounddate);
     System.out.println("outbounddate : " + fmt.format(myoutbounddate));
     System.out.println("inbounddate : " + fmt.format(myinbounddate));   
     if (myoutbounddate.compareTo(myinbounddate) < 0) {
    	
       System.out.println("outbounddate is before inbounddate, we should be redirected to Book a flight page");
       assertTrue("You are not redirected to Book flight page", driver.getTitle().equals("Book a flight"));
   } else {
       System.out.println("outbounddate is after inbounddate, which is not possible, we stay on the home page for update");
      assertTrue("We are not on the right page", driver.getTitle().equals("Transavia is the airline of choice for affordable flights!"));
       
  } 
    
     }
  
	
}