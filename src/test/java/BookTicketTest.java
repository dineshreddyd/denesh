
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Balze.ObjectReference;

import resources.Base;

public class BookTicketTest  extends Base{
	 ObjectReference  elementref;
	 
	@BeforeTest	
public void prestart(){
		
		baseDriver = startUp();
		baseDriver.get("https://blazedemo.com");
		
	}
	
	// scenario 1
	@Test(priority=1)
	public void scenario2() throws InterruptedException{
		
		elementref= new ObjectReference(baseDriver);
	     
	    //1.validating the user lands on the correct page
				 String header= elementref.getHomepageHeader().getText();
			     Assert.assertEquals(header, "Welcome to the Simple Travel Agency!");
	     
	    // 2.//selecting the source from the drop down 
			     	Select sorcesel = new Select(elementref.getsource());
					sorcesel.selectByValue("Boston");
				//3.selecting the destination from the drop down 
					Select dessel = new Select(elementref.getDestination());
					dessel.selectByValue("London");
					elementref.getSearch().click();
					Thread.sleep(2000);
			//4.select the flight  and the details of the flight like flignt number , airline and  cost 
					
					String flightname =  elementref.getResultFlight().getText();
					String Airline = elementref.getResultAirline().getText();
					String cost = elementref.getResultPrice().getText();
					
						int filghtcost = Integer.parseInt(cost);
						
						
			//5.the user lands on the purchase page and the details of the flight he selected will be displayed 
						//validating the firelds with the selected flight details 
						
						
						String userflight =  elementref.getFlight().getText();
						 Assert.assertEquals(flightname, userflight);
						
						String userAirline = elementref.getAirline().getText();
						 Assert.assertEquals(Airline, userAirline);
						
						String finalcost = elementref.getPrice().getText();
						 Assert.assertEquals(cost, finalcost);
						
						
				//6.if all the details are matched then we will enter the user details 
						 
						// enter the details of the flight 
							elementref.getfirstName().sendKeys("TestfirstName");
							elementref.getaddress().sendKeys("1203Highroad");
							elementref.getcity().sendKeys("wintertown");
							elementref.getstate().sendKeys("Chinago");
							
							
							elementref.getzipCode().sendKeys("45221");
							Select cardType = new Select(elementref.getCardTyep());
							cardType.selectByValue("dinersclub");
							elementref.getcardNumber().sendKeys("96500011232");
							elementref.getcardMonth().clear();
							elementref.getcardMonth().sendKeys("06");
							elementref.getcardYear().clear();
							elementref.getcardYear().sendKeys("2022");
							elementref.getcardName().sendKeys("JohnSmith");
							elementref.getpurchseButton().click();
							
							
							
							 System.out.println(elementref.getOrderID().getText());
						 
						 
						 
	     
		
	}
	
	
	// as the details are getting matched in the application i have written the happy flow 
	
	@Test(priority=2)
	public void PlaceOrder() throws InterruptedException{
		
		
		elementref= new ObjectReference(baseDriver);
		
		// validating the user lands on the correct page
		 String header= elementref.getHomepageHeader().getText();
	     Assert.assertEquals(header, "Welcome to the Simple Travel Agency!");
	     
		//selecting the source from the drop down 
		Select sorcesel = new Select(elementref.getsource());
		sorcesel.selectByValue("Boston");
		// selecting the destination from the drop down 
		Select dessel = new Select(elementref.getDestination());
		dessel.selectByValue("London");
		elementref.getSearch().click();
		Thread.sleep(2000);
		// select the flight  
		
		elementref.getselectButton().click();
		// enter the details of the flight 
		elementref.getfirstName().sendKeys("TestfirstName");
		elementref.getaddress().sendKeys("1203Highroad");
		elementref.getcity().sendKeys("wintertown");
		elementref.getstate().sendKeys("Chinago");
		
		
		elementref.getzipCode().sendKeys("45221");
		Select cardType = new Select(elementref.getCardTyep());
		cardType.selectByValue("dinersclub");
		elementref.getcardNumber().sendKeys("96500011232");
		elementref.getcardMonth().clear();
		elementref.getcardMonth().sendKeys("06");
		elementref.getcardYear().clear();
		elementref.getcardYear().sendKeys("2022");
		elementref.getcardName().sendKeys("JohnSmith");
		elementref.getpurchseButton().click();
		
		 System.out.println(elementref.getOrderID().getText());
		 
		
		
		
	}
	
	
	
	
	
	
}
