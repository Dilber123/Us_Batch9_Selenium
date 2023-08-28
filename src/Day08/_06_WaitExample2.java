package Day08;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _06_WaitExample2 extends BaseDriver {

    /**
     * go to http://demo.seleniumeasy.com/ajax-form-submit-demo.html
     * type name and a command
     * click on submit button
     * verify you see "succes" keyword
     */

    @Test

    public void
    waitExample(){

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement nameInput = driver.findElement(By.id("title"));
        nameInput.sendKeys("Batch9");


        WebElement commentInput = driver.findElement(By.id("description"));
        commentInput.sendKeys("We are coming!");


        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submitted Successfully!"));

        WebElement successMessage = driver.findElement(By.id("submit-control"));

        Assert.assertTrue(successMessage.getText().contains("Successfully"));


        waitAndQuit();

    }

}


//We run the code first, withoutWebDriverWait wait= new WebDriverWait. However, our test failed. Because Selenium
// is so fast. Instead of showing the text we want, it showed the first text there, which was
//"ajax request is processing". So that,s why we need to insert WebDriverWait wait....