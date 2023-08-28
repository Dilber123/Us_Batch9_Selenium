package Day06;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsSingleClick extends BaseDriver {


    @Test
    public void singleClickTest(){

        driver.get("https://demoqa.com/buttons");

        WebElement singleClickButton =driver.findElement(By.xpath("//button[text()='Click Me']"));

        MyMethods.myWait(2);

        Actions actions = new Actions(driver);
        Action action = actions.click(singleClickButton).build();//Selenium prepares the action for us and waits
        action.perform();//can perform same action multiple times
        //action.perform();
        // action.perform();

        // actions.click(singleClickButton).build().perform()-> also work but each time you need to write entire
        //line again and again.But above you just need to write action.perform for the 2nd, 3rd, 4th so on.

        // Action action1 =actions.moveToElement(singleClickButton).click().build()
        // you can create multiple actions by using the one in line 23

        waitAndQuit();

    }

}
