package com.test.Autoframework.uiAutoframework.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.Autoframework.uiAutoframework.testBase.testBase;

public class HomePage 
{
	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	WebDriver driver;
	
	@FindBy(xpath =".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;

	@FindBy(xpath ="//*[@id='email']")
	//@FindBy(id ="email")
	WebElement loginEmailAddress;
	
	@FindBy(xpath ="//*[@id='passwd']")
	WebElement loginpassword;
	
	@FindBy(id = "SubmitLogin")
	WebElement submitButton;
	
	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;
	
	@FindBy(xpath =".//*[@id='email_create']")
	WebElement email_create;
	
	@FindBy(xpath =".//*[@id='SubmitCreate']")
	WebElement CreateAccountbutton;
	
	@FindBy(xpath =".//*[@id='id_gender1']")
	WebElement Gender;
	
	@FindBy(xpath =".//*[@id='customer_firstname']")
	WebElement firstname;
	
	@FindBy(xpath =".//*[@id='customer_lastname']")
	WebElement lastname;
	
	@FindBy(xpath =".//*[@id='passwd']")
	WebElement password;
	
	@FindBy(css="option[value=\"23\"]")
	WebElement days;
	
	@FindBy(css="#months > option[value=\"9\"]")
	WebElement months;
	
	@FindBy(css="option[value=\"1983\"]")
	WebElement years;
	
	@FindBy(xpath =".//*[@id='firstname']")
	WebElement first_name;
	
	@FindBy(xpath =".//*[@id='lastname']")
	WebElement last_name;
	
	@FindBy(xpath =".//*[@id='company']")
	WebElement Companyname;
	
	@FindBy(xpath = ".//*[@id='address1']")
	WebElement address1;
	
	@FindBy(xpath = ".//*[@id='address2']")
	WebElement address2;
	
	@FindBy(xpath = ".//*[@id='city']")
	WebElement city;
	
	@FindBy(css ="#id_state > option[value=\"14\"]")
	WebElement State;
	
	@FindBy(xpath = ".//*[@id='postcode']")
	WebElement postcode;
	
	@FindBy(css ="#id_country > option[value=\"21\"]")
	WebElement Country;
	
	@FindBy(xpath =".//*[@id='phone_mobile']")
	WebElement Mobileno;
	
	@FindBy(xpath = ".//*[@id='alias']")
	WebElement alias;
	
	@FindBy(id = "submitAccount")
	WebElement submitAccount;
	
	@FindBy(xpath =".//*[@id='center_column']/p")
	WebElement MyAccount;
	
	@FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/div[2]/a")
	WebElement logout;
	
	public HomePage(WebDriver driver) 
	{ 
	  
	  PageFactory.initElements(driver, this);
	}
	public void LoginToApplication(String emailAddress, String password)
	{
		signIn.click();
		log.info("Click the SignIn" + signIn.toString());
		loginEmailAddress.sendKeys(emailAddress);
		log.info("enter the emailaddress" +emailAddress +"Object of EmailAddress" +loginEmailAddress.toString());
		loginpassword.sendKeys(password);
		log.info("enter the password" +password +"Object of EmailAddress" +loginpassword.toString());
		submitButton.click();
		log.info("Click to Submit button and Obejct is:" +submitButton.toString());
		//logout.click();
	}
	public boolean verifyLogoutDisplay()
	{
		try{
			logout.isDisplayed();
			log.info("logout button is displayed and object is:-" +logout.toString());
			return true;
			
		}catch(Exception e){
			return false;
		}				
	}
	public void clickonlogout()
	{
		logout.click();
		log.info("Clicked on logout button and object is:-" +logout.toString());
	}
	public String getInvalidLoginText()
	{
		log.info("Error Message is:" +authenticationFailed.toString());
		return authenticationFailed.getText();
		
	}
	public  void days() 
	{
	    By days =  By.cssSelector("option[value=\"23\"]");
	    driver.findElement(days).click();      
	}	
	public  void months() 
	{
	    By months =  By.cssSelector("#months > option[value=\"9\"]");
	    driver.findElement(months).click();      
	}	
	public  void years() 
	{
	    By years =  By.cssSelector("option[value=\"1983\"]");
	    driver.findElement(years).click();      
	}	
	public  void State() 
	{
	    By state =  By.cssSelector("#id_state > option[value=\"14\"]");
	    driver.findElement(state).click();      
	}	
	public  void country() 
	{
	    By country =  By.cssSelector("#id_country > option[value=\"21\"]");
	    driver.findElement(country).click();      
	}
	
	public String getAccountCreateMessage()
	{
		//log.info("Error Message is:" +authenticationFailed.toString());
		return MyAccount.getText();
		
	}
	public void CreateAccount()
	{
		signIn.click();
		email_create.sendKeys("kramesh@rediffmail.com");
		CreateAccountbutton.click();
		Gender.click();
		firstname.sendKeys("Korla");
		lastname.sendKeys("Ramesh");
		password.sendKeys("test123");
		days.click();
		months.click();
		years.click();
		first_name.sendKeys("Ramesh");
		last_name.sendKeys("Naidu");
		Companyname.sendKeys("Vectramind");
		address1.sendKeys("N Hamilton St, 101");
		address2.sendKeys("Wisconsin");
		city.sendKeys("Madison");
		State.click();
		postcode.sendKeys("53703");
		Country.click();
		Mobileno.sendKeys("9948116666");
		alias.clear();
		alias.sendKeys("Home Address");
		submitAccount.click();	
	}

}
