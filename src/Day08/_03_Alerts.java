package Day08;      //  8/24/23 1st Rec

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Alerts extends BaseDriver {

    @Test
    public void sendKeysToAlertTest(){
        /**
         * Go to http://demo.seleniumeasy.com/javascript-alert-box-demo.html
         * Click on Click for Prompt Button
         * Type your message
         * Click on OK
         * Verify that you see your message
         **/


        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyMethods.myWait(2);

        WebElement clickForPromptButton = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickForPromptButton.click();                                                 //you can also use css selector

        String ourMessage="Our Batch is the best";

        MyMethods.myWait(2);
        driver.switchTo().alert().sendKeys(ourMessage);//("Our Batch is the best");//we can send a message
                                                       //Teacher later decided to use String message
        MyMethods.myWait(2);
        driver.switchTo().alert().accept();

        WebElement message =driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue(message.getText().contains(ourMessage));

        waitAndQuit();

    }

}
  //Alerts are not html code. They are part of the browser.