package com.qa.Balze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectReference {
	
	
	public WebDriver driver; 
	
	By source = By.name("fromPort");
	By Destination = By.name("toPort");
	By searchButton = By.xpath("//input[@type='submit']");
	By selectButton = By.xpath("//tr[2]//td[1]//input[1]");
	
	// Input fields  of the customer 
	By firstName = By.id("inputName");
	By address = By.id("address");
	By city = By.id("city");
	By  state = By.id("state");
	By zipCode = By.id("zipCode");
	By CardTyep = By.id("cardType");
	By cardNumber = By.id("creditCardNumber");
	By cardMonth = By.id("creditCardMonth");
	By  cardYear = By.id("creditCardYear");
	By cardName = By.id("nameOnCard");
	By purchseButton = By.xpath("//input[@value='Purchase Flight']");
	By OrderID = By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]");

	By HomepageHeader = By.xpath("//div[@class ='container']/h1");
	
	// search Results 
	By ResultFlight = By.xpath("//tr[2]//td[2]");
	By ResultAirline = By.xpath("//tr[2]//td[3]");
	By ResultPrice = By.xpath("//tr[2]//td[6]");
	
	
	//Purchase page 
	By FlightName= By.xpath("/html/body/div[2]/p[1]");
	By AirlineName= By.xpath("/html/body/div[2]/p[2]");
	By Price = By.xpath("/html/body/div[2]/p[3]");
	
	
	
	
	

	public ObjectReference(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
public WebElement getResultFlight(){
		
		return driver.findElement(ResultFlight);
	}

public WebElement getResultAirline(){
	
	return driver.findElement(ResultFlight);
}

public WebElement getResultPrice(){
	
	return driver.findElement(ResultFlight);
}


public WebElement getFlight(){
	
	return driver.findElement(FlightName);
}

public WebElement getAirline(){

return driver.findElement(AirlineName);
}

public WebElement getPrice(){

return driver.findElement(Price);
}


	
	public WebElement getHomepageHeader(){
		
		return driver.findElement(HomepageHeader);
	}
	
	
 public WebElement getOrderID(){
	
	return driver.findElement(OrderID);
}
	
public WebElement getsource(){
		
		return driver.findElement(source);
	}
	
public WebElement getDestination(){
	
	return driver.findElement(Destination);
}
public WebElement getSearch(){
	
	return driver.findElement(searchButton);
}
public WebElement getselectButton(){
	
	return driver.findElement(selectButton);
}	




public WebElement getfirstName(){
	
	return driver.findElement(firstName);
}

public WebElement getaddress(){
	
	return driver.findElement(address);
}

public WebElement getcity(){
	
	return driver.findElement(city);
}

public WebElement getstate(){
	
	return driver.findElement(state);
}


public WebElement getzipCode(){
	
	return driver.findElement(zipCode);
}
public WebElement getCardTyep(){
	
	return driver.findElement(CardTyep);
}
public WebElement getcardNumber(){
	
	return driver.findElement(cardNumber);
}
public WebElement getcardMonth(){
	
	return driver.findElement(cardMonth);
}
public WebElement getcardYear(){
	
	return driver.findElement(cardYear);
}
public WebElement getcardName(){
	
	return driver.findElement(cardName);
}
public WebElement getpurchseButton(){
	
	return driver.findElement(purchseButton);
}






}