package com.testing.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestWebPagePO {



    @FindBy(linkText = "Complete Web Form")
    public static WebElement WebFormLink;

    @FindBy(id = "first-name")
    public static WebElement FirstNameField;

    @FindBy(id = "last-name")
    public static WebElement LastNameField;

    @FindBy(id = "job-title")
    public static WebElement JobTitleField;

    @FindBy(xpath = "/html/body/div/form/div/div[8]/a")
    public static WebElement SubmitButton;


    public TestWebPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }



    public void clickWebForm(){WebFormLink.click();}

    public void enterFirstName(String FirstName){FirstNameField.sendKeys(FirstName);}

    public void enterLastName(String LastName){LastNameField.sendKeys(LastName);}

    public void enterJobTitle(String JobTitle){JobTitleField.sendKeys(JobTitle);}

    public void clickSubmitButton(){SubmitButton.click();}

}

