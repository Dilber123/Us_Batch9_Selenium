package Day08;    //  8/24/23 1st Rec

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_AlertsIntro extends BaseDriver {

    /**
     * What is an Alert?
     * Alert is a Javascript code, not part of the html code.
     * It is triggered by a button or something  we do on the page.
     * It is a kind of message.
     * How do you handle it?
     * driver.switchTo.alert.accept();
     *driver.switchTo.alert.dismiss();
     * driver.switchTo.alert.sendKeys();
   **/

    @Test
     public void alertTest1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyMethods.myWait(2);

        WebElement clickMeButton1 = driver.findElement(By.cssSelector("button[class\"btn btn-default\"]"));
        clickMeButton1.click();

        MyMethods.myWait(2);

        driver.switchTo().alert().accept();//switches to the alert and accepts it by clicking on Ok or accept button.

        waitAndQuit();

    }
}
