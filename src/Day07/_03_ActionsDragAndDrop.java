package Day07;       //8/23 23 2nd Rec

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

public class _03_ActionsDragAndDrop extends BaseDriver {

    @Test

    public void dragAndDropTest(){
        driver.get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement Oslo =driver.findElement(By.id("box1"));

        WebElement Norway =driver.findElement(By.id("101"));

        MyMethods.myWait(2);

        Actions actions = new Actions(driver);
        Action action = actions.dragAndDrop(Oslo, Norway).build();
        action.perform();

        MyMethods.myWait(2);
//---------------------
       //There is one more way. Let's do it with another element,Washington.

        WebElement Washington =driver.findElement(By.id("box3"));

        WebElement USA =driver.findElement(By.id("103"));

        action = actions. clickAndHold(Washington ).moveToElement(USA).release().build();
        action.perform();

//-----------------------
        String backGroundColorOfWashington =Washington.getCssValue("background-color");
        System.out.println( "backGroundColorOfWashington =" +"backGroundColorOfWashington" );

        Assert.assertTrue(Washington.getCssValue("background-color").equals("rgba(0, 255, 0, 1)"));

        waitAndQuit();

        //Css value = styling value---gives any style attribute
    }

}




