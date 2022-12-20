package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAddCandidates {

    public static WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestAddCandidates() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu Recruitment")
    public void user_click_menu_recruitment() {
//		Hooks.delay(1);
        recruitmentPage.menuRecruitment();
        extentTest.log(LogStatus.PASS, "User click menu Recruitment");
    }

    @And("User click button Add")
    public void user_click_button_add() {
//		Hooks.delay(1);
        recruitmentPage.btnAdd();
        extentTest.log(LogStatus.PASS, "User click button Add");
    }
    
    @And("User enter data")
    public void user_enter_data() {
        recruitmentPage.addCandidates("Nama", "Saya", "Budi", "Budi@jonggol.com");
        extentTest.log(LogStatus.PASS, "User enter data");
    }

    @Then("User click button submit")
    public void submit() {
        recruitmentPage.submit();
        extentTest.log(LogStatus.PASS, "User click button submit");
    }

}
