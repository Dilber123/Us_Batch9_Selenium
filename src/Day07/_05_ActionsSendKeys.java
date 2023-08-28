package Day07;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsSendKeys extends BaseDriver {

    @Test

    public void sendKeysTest(){


        MyMethods.myWait(2);

        driver. get("https://demoqa.com/auto-complete");

        WebElement singleColorInput =driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions actions = new Actions(driver);
        Action action = actions.click(singleColorInput).
                keyDown(Keys.SHIFT).sendKeys("b").
                keyUp(Keys.SHIFT).sendKeys("lack").build();

                action.perform();

   //     waitAndQuit();

       //after we typed the color let's hit enter and release to select

       //action = actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build();  Or,
        action = actions.sendKeys(Keys.ENTER).build();
        action.perform();

        waitAndQuit();



//sendKeys:just hits the button like regular typing.Doesn't hold the button

    }
}
