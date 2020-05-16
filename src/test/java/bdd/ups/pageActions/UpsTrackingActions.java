package bdd.ups.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import bdd.ups.pageElements.UpsTrackingElements;
import bdd.ups.utilities.SetupDrivers;

public class UpsTrackingActions {
	UpsTrackingElements trackingPageElements;

	public UpsTrackingActions() {
		this.trackingPageElements = new UpsTrackingElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, trackingPageElements);
	}

	public void navigateToUpsTrackingPage() {
		SetupDrivers.chromeDriver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void inputTrackingNumber(String trackNum) {
		trackingPageElements.trackNumberInput.sendKeys(trackNum);
	}

	public void clickOnTrackButton() {
		trackingPageElements.trackButton.click();
	}

	public String trackErrorMsg() {
		return trackingPageElements.trackingErrorMsg.getText();
	}
}
