package bdd.ups.stepDef;
import org.testng.Assert;

import bdd.ups.pageActions.UpsTrackingActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpsTrackingStepDef {
UpsTrackingActions upsTracking = new UpsTrackingActions();

@Given("^UPS tracking page launched$")
public void ups_tracking_page_launched() {
	upsTracking.navigateToUpsTrackingPage();  
}

@When("^Customer input incorrect tracking number \"([^\"]*)\"$")
public void customer_input_incorrect_tracking_number(String trackNum) {
	upsTracking.inputTrackingNumber(trackNum);
}

@When("^Customer clicks on track button$")
public void customer_clicks_on_track_button() {
    upsTracking.clickOnTrackButton();
}

@Then("^Customer should receive an error message as \"([^\"]*)\"$")
public void customer_should_receive_an_error_message_as(String expectedErrorMessage) {
	String actualErrorMesssage = upsTracking.trackErrorMsg();
	Assert.assertEquals(actualErrorMesssage, expectedErrorMessage);	
}

}
