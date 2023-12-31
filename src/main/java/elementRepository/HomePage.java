package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePage {

	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Content_lblBelegerfassen")
	WebElement homePageHeading;
	@FindBy(id="Content_lblShipmentOverview")
	WebElement userAdminHomePageHeading;
	
	public String getHomePageText() {
		return gu.getElementText(homePageHeading);
	}
	public String getuserAdminHomePageHeadingText() {
		return gu.getElementText(userAdminHomePageHeading);
	}
}
