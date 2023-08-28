package Day07;                // 8/23/23 1st Rec

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionsHoverOver extends BaseDriver {

    /**
     * Go to "https://www.ebay.com/"
     * Hover over Electronics menu
     *Click on Headphones
     * Assert that url contains Headphones keyboard

     */

    @Test

    public void ActionsHoverOverTest (){

         driver.get("https://www.ebay.com/");

        WebElement electronics =driver.findElement(By.linkText("Electronics"));

        Actions actions = new Actions(driver);
        Action action =actions. moveToElement(electronics).build();

        action.perform();
//-------you can run here

        MyMethods.myWait(2);

        WebElement headphones =driver.findElement(By.xpath("//a[text()=Headphones']"));
        headphones .click();
// ------you can run here

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("Headphones"));

        waitAndQuit();
    }

}
