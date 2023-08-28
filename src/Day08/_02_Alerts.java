package Day08;   //8/24/23  1st Rec

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Alerts extends BaseDriver {

    @Test

    public void alertTestDismissTest(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyMethods.myWait(2);

        WebElement clickOnMeButton2 =driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\"])[1]"));
                                                                      //we have two. We want the 1st one.
        clickOnMeButton2.click();

        MyMethods.myWait(2);

        driver.switchTo().alert().dismiss();//switches to the alert and dismiss it by clicking on cancel button

        waitAndQuit();


    }

}
