package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class PageHome extends TestBase {

	@FindBy(xpath = "//a[text()='Release date']")private WebElement releasedatelabel;
	@FindBy(xpath = "//button[text()='Country of origin']") private WebElement countaryoforiginlabel;
	
	@FindBy(xpath = "//a[normalize-space(text())='December 17, 2021 (United States)']") private WebElement datelabel;
	@FindBy(xpath = "//a[normalize-space(text())='India']")private WebElement countarylabel;
	
	
	@FindBy(xpath= "//a[text() = 'Release date']") private WebElement releaseDate;
	@FindBy(xpath= "//a[text() = 'December 17, 2021 (United States)']") private WebElement decemberDate;
	@FindBy(xpath= "//a[text() = 'India']") private WebElement India;
	@FindBy(xpath= "//button[text()= 'Country of origin']") private WebElement Origin;

	public PageHome()
	{
	 PageFactory.initElements(driver, this);
	}
	
	public String verifyText1()
	{
		return releaseDate.getText();
	}

	public String verifyText2()
	{
		return Origin.getText();
	}
	
	public void Date()
	{
		String actualText = decemberDate.getText();
		actualText = actualText.replace("ID : "," ");
		System.out.println(actualText);
	}
	
	public void verifyCountry()
	{
		String actualText = India.getText();
		actualText = actualText.replace("ID : "," ");
		System.out.println(actualText);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public PageHome()
//	{
//	 PageFactory.initElements(driver, this);
//	}
//	
//	public void verifyreleasedatelabel()
//	{
//		releasedatelabel.isDisplayed();
//	}
//	
//	public void verifycountaryoforiginlabel()
//	{
//		countaryoforiginlabel.isDisplayed();
//	}
//	
//	public String verifydatelabel()
//	{
//     return datelabel.getText();
//
//	}
//	
//	public String verifycountarylabel()
//	{
//	return countarylabel.getText();
//	}
	
	
	
	
	
}
