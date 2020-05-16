package bdd.ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsTrackingElements {
	@FindBy(id = "stApp_trackingNumber")
	public WebElement trackNumberInput;

	@FindBy(id = "stApp_btnTrack")
	public WebElement trackButton;

	@FindBy(id = "stApp_statusErrorText")
	public WebElement trackingErrorMsg;
}
