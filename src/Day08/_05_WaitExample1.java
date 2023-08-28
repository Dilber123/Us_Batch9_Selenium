package Day08;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _05_WaitExample1 extends BaseDriver {

    /**
     /**
     * Go to  "http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html"
     * Click on Timer Button
     * Verify that you see WebDriver text
     * **/

    @Test

     public void waitTest(){

      driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement timerButton =driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        timerButton.click();

    //    MyMethods.myWait(20); //you can do the same thing using this thread sleep. Maybe we saw the WebDriver in 10 sec.
    //    Maybe we saw the WebDriver in 10 sec. why do we need to wait another 10 sec.
    //    It waits entire 20 sec. Even though the text becomesWebDriver in 10 secs.

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));// two parameters are driver and timeout
        wait.until(ExpectedConditions.textToBe(By.id("demo"), "WebDriver"));

        //waits until the text of the element becomes WebDriver for 20 seconds
        //if it becomes WebDriver before 20 sec selenium keeps running the code
        // if it doesn't become WebDriver in 20 sec it throws TimeOutException

        WebElement message =driver.findElement(By.id("demo")); //<p id="demo"   we don't need <p tag
        String messageText = message.getText();
        System.out.println("messageText = " +messageText);

        Assert.assertEquals("WebDriver", messageText); //actual is "messageText"

        waitAndQuit();

    }

     }
//  first the code is run without WebDriverWait
//  the test failed.Bec,the test that Selenium got is,
//  "Click on"try it".I will display automation tools after some interval".Bec, it takes time to see "WebDriver"
//  So we need to wait. How? we need to use WebDriverWait=new WebDriverWait

//  if you want, you can use driver.quit at the end. But because we are still learning we want to see what's going on,
// that's why we use waitAndQuit.