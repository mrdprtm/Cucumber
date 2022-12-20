package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class RecruitmentPage {
	private WebDriver driver;
	
	public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

	@FindBy(xpath = "//span[normalize-space()='Recruitment']")
	WebElement menuRecruitment;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement btnAdd;
	
	@FindBy(name = "firstName")
    WebElement firstName;
	
	@FindBy(name = "middleName")
    WebElement middleName;
	
	@FindBy(name = "lastName")
    WebElement lastName;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	WebElement email;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    
    public void menuRecruitment(){
        menuRecruitment.click();
    }
    
    public void btnAdd(){
        btnAdd.click();
    }
    
    public void addCandidates(String firstName, String middleName, String lastName, String email){
        this.firstName.sendKeys(firstName);
        this.middleName.sendKeys(middleName);
        this.lastName.sendKeys(lastName);
        this.email.sendKeys(email);
    }
    
    public void submit(){
        submit.click();
    }
}
