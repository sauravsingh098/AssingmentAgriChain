package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLongestString extends Test_Methods{
    @Test
    public void TestLongSubString() throws InterruptedException {
        ObjectRepositary stringChar= PageFactory.initElements(driver,ObjectRepositary.class);
        stringChar.enterChar("aabbcc");
        stringChar.submitButton();

    }
}
