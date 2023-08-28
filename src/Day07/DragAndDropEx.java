package Day07;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx extends BaseDriver {

    @Test

    public void dragAndDropTest(){

        driver.get("http://www.dhtmlgoodies.com/");

        WebElement capitalElement = driver.findElement(By.id("capital"));
        WebElement countryelement = driver.findElement(By.id("country"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(capitalElement,countryelement).build().perform();

      //  verifyColorChange("green")



        waitAndQuit();
    }


}
