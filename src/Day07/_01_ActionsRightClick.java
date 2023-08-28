package Day07;          // 8/23/23 1st Rec

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsRightClick extends BaseDriver {

    @Test

    public void rightClickTest(){
        driver.get("https://demoqa.com/button");


        WebElement rightClickButton = driver.findElement(By.xpath("//button[text() ='Right Click Me']"));

        MyMethods.myWait(2);

        Actions actions = new Actions(driver);
        Action action = actions.contextClick(rightClickButton).build();
        action.perform();

        //or you can do this as follows
        //actions.contextClick(rightClickButton).build().perform();


         waitAndQuit();

    }
}

