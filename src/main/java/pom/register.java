package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class register {

		WebDriver driver;
		
		@FindBy(xpath="//input[@placeholder='First Name']")
		WebElement  fname;
		@FindBy(xpath="//input[@placeholder='Last Name']")
		WebElement  lname;
		@FindBy(xpath="//textarea[@rows='3']")
		WebElement  address;
		@FindBy(xpath="//input[@type='email']")
		WebElement  email;
		@FindBy(xpath="//input[@type='tel']")
		WebElement  phone;
		@FindBy(xpath="//input[@value='FeMale']")
		WebElement  gender;
		@FindBy(xpath="//input[@id='checkbox1']")
		WebElement hobby;
		@FindBy(xpath="//div[@id='msdd']")
		WebElement language;
		@FindBy(xpath="//select[@id='Skills']")
		WebElement skill;
		@FindBy(xpath="//select[@id='countries']")
		WebElement country;
		@FindBy(xpath="//span[@role='combobox']")
		WebElement selcountry;
		@FindBy(xpath="//input[@type='search']")
		WebElement search;
		@FindBy(xpath="//span[@class='select2-results']/ul/li[text()='India']")
		WebElement selIndia;
		@FindBy(xpath="//select[@placeholder='Year']")
		WebElement dob1;
		@FindBy(xpath="//select[@placeholder='Month']")
		WebElement dob2;
		@FindBy(xpath="//select[@placeholder='Day']")
		WebElement dob3;
		@FindBy(xpath="//input[@id='firstpassword']")
		WebElement password;
		@FindBy(xpath="//input[@id='secondpassword']")
		WebElement confpassword;
		@FindBy(xpath="//button[@id='submitbtn']")
		WebElement submit;
		public register(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void set_fname(String firstname){
		fname.sendKeys(firstname);
			}
		public void set_lname(String lastname){
			lname.sendKeys(lastname);
			}
		public void set_address(String adrs){
			address.sendKeys(adrs);
			}
		public void set_mail(String mail){
			email.sendKeys(mail);
			}
		public void set_phone(String ph){
			phone.sendKeys(ph);
			}
		public void click_gender(){
			gender.click();
			}
		public void click_hobby(String clkhobby){
			hobby.sendKeys(clkhobby);
		}
		public void sel_language(String lang){
			language.click();
		}
		public void sel_skill(String skills){
			Select sel=new Select(skill);
			sel.selectByVisibleText(skills);
		}
		public void sel_country(String country1){
			Select sel=new Select(country);
			sel.selectByVisibleText(country1);
		}
		public void sel_selectcountry(String type){
			selcountry.click();
			search.sendKeys(type);
			selIndia.click();
		}
		public void sel_year(String year){
			Select sel=new Select(dob1);
			sel.selectByVisibleText(year);
		}
		public void sel_month(String month){
			Select sel=new Select(dob2);
			sel.selectByVisibleText(month);
		}
		public void sel_date(String date){
			Select sel=new Select(dob3);
			sel.selectByVisibleText(date);
		}
		public void type_password(String password1){
			password.sendKeys(password1);
		}
		public void type_password2(String password2){
			confpassword.sendKeys(password2);
		}
		public void submit(){
			submit.click();
		}
	}


