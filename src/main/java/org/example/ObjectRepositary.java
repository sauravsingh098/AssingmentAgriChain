package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectRepositary {
    WebDriver driver;
    public ObjectRepositary(WebDriver driver){
        this.driver=driver;
    }
    //using findby
    @FindBy(how= How.XPATH, using = "")
    WebElement StingInput;
    @FindBy(how=How.XPATH,using ="")
    WebElement Submit;

    public void enterChar(String enterChar){
        StingInput.sendKeys(enterChar);
    }

    public void submitButton(){
        Submit.click();
    }
}
