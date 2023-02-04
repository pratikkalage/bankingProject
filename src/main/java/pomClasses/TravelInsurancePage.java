package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TravelInsurancePage {

	@FindBy(xpath = "//button[text()='Next']") private WebElement next; 	
	@FindBy(xpath = "//input[@id='country']") private WebElement dest; 
	@FindBy(xpath = "//ul[@class='search-list']/li") private WebElement firstopt; 
	@FindBy(xpath = "(//input[@type='text'])[1]") private WebElement sDate; 
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement eDate; 

	@FindBy(xpath = "//select[@id='feet']") private WebElement age; 
	
	@FindBy(xpath = "(//input[@type='radio'])[1]") private WebElement opt;
	
	@FindBy(xpath = "//input[@id='mobileNumber']") private WebElement mob;
	@FindBy(xpath = "(//div[@class='prd-icon add shadowHandler short'])[7]") private WebElement travelInsurance; 
	
	// Constructor
	public TravelInsurancePage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTravelInsurance() {
		travelInsurance.click();
	}
	// usage
	public void enterDestination(String destn) {
		dest.sendKeys(destn);		
	}
	
	public void selectFirstOption() {
		firstopt.click();
	}
	
	public void clickOnNext() {
		next.click();
	}
	
	public void enterStartDate(String date) {
		sDate.sendKeys(date);
	}
	public void enterEndDate(String date) {
		eDate.sendKeys(date);
	}
	
	public void selectAge(String ag) {
		Select s = new Select(age);
		s.selectByValue(ag);
	}
	
	public void selectMedicalCondition() {
		opt.click();
	}
	
	public void enterMobile(String number) 
	{
		mob.sendKeys(number);
	}
	
}
