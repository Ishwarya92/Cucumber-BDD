package stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pom.register;
import pom.skipsign;

public class loginStepDefinitions {
	WebDriver driver;
	@Given("^user login to the site$")
	public void login() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\jars\\chromedriver.exe");
	//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//driver = new RemoteWebDriver(new URL("http://192.168.43.47:4444/wd/hub"),capabilities);
	
	driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Index.html");
	driver.manage().window().maximize();
	
	}
	@Then("^click on the Skiplogin$")
	public void SkipLogin(){
		skipsign objskip=new skipsign(driver);
		objskip.clickskipsign();
	//driver.findElement(By.xpath("//button[@id='btn2']")).click();
	}
	@Then("^enter the firstname as \"(.*)\" and lastname as \"(.*)\"$")
	 public void user_enters_firstname_lastname(String fname, String lname){
		register objregister=new register(driver);
		objregister.set_fname(fname);
		objregister.set_lname(lname);
	 //driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
	 //driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
	 }
	@Then("^enter the address as \"(.*)\" and email as \"(.*)\"$")
	public void user_enter_address(String address,String email ){
		register objregister=new register(driver);
		objregister.set_address(address);
		objregister.set_mail(email);
	//driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(address);
	//driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
	}
	@Then("^enter the phone num as \"(.*)\"$")
	public void user_enter_phone(String phone){
		register objregister=new register(driver);
		objregister.set_phone(phone);
	//driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phone);
	}
	@Then("^click on the radiobutton as \"(.*)\"$")
	public void click_Gender(String gender){
		register objregister=new register(driver);
		objregister.click_gender();	
	//driver.findElement(By.xpath("//input[@value='"+gender+"']")).click();
	}
	@Then("^click on the Hobbies as \"(.*)\"$")
	public void click_hobbies(String hobby){
		register objregister=new register(driver);
		objregister.click_hobby(hobby);
	//driver.findElement(By.xpath("//input[@value='"+hobby+"']")).click();
	}
	@Then("^select the language as \"(.*)\"$")
	public void select_language(String language){
		register objregister=new register(driver);
		objregister.sel_language(language);
	//driver.findElement(By.xpath("//div[@id='msdd']")).click();
	}
	@Then("^select the Skill as \"(.*)\"$")
	public void select_skill(String skill){
		register objregister=new register(driver);
		objregister.sel_skill(skill);
	//Select sel =new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
	//sel.selectByVisibleText(skill);
	}
	@Then("^select the country dropdown as \"(.*)\"$")
	public void select_country(String country){
		register objregister=new register(driver);
		objregister.sel_country(country);
	//Select sel=new Select(driver.findElement(By.xpath("//select[@id='countries']")));
	//sel.selectByVisibleText(country);
	}
	@Then("^select the select country by typing \"(.*)\" and select the select country as \"(.*)\"$")
	public void select_selectcountry(String type,String selcountry){
		register objregister=new register(driver);
		objregister.sel_selectcountry(type);
	//driver.findElement(By.xpath("//span[@role='combobox']")).click();
	//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(type);
	//driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[text()='"+selcountry+"']")).click();
	}
	@Then("^enter the password1 as \"(.*)\" and password2 as \"(.*)\"$")
	public void enter_password_confirm_password(String password,String cpassword){
		register objregister=new register(driver);
		objregister.type_password(password);
		objregister.type_password2(cpassword);
	//driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(password);
	//driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(password);
	}
	@Then("^select the year as \"(.*)\" and month as \"(.*)\" and date as \"(.*)\"$")
	public void select_DOB(String year,String month,String date){
		register objregister=new register(driver);
		objregister.sel_year(year);
		objregister.sel_month(month);
		objregister.sel_date(date);
//		Select sel =new Select(driver.findElement(By.xpath("//select[@placeholder='Year']")));
//		sel.selectByVisibleText(year);
//		sel=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
//		sel.selectByVisibleText(month);
//		sel=new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
//		sel.selectByVisibleText(date);
		}
	@Then("^click on the submit$")
	public void Submit(){
		register objregister=new register(driver);
		objregister.submit();
	//driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
}
}