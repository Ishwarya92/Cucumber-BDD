package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skipsign {

	WebDriver driver;
	@FindBy(xpath="//button[@id='btn2']")
	WebElement skipsign;
	public skipsign(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public  void clickskipsign(){
	skipsign.click();	
	}

}
