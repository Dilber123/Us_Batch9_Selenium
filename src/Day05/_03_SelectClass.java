package Day05;                          // 8/22/23   1st Rec

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectClass extends BaseDriver {

/**
 * What is Select Class?
 * It is a class that allows us to handle select tags
 * We create a Select object and, then we use this object to handle select elements
 *
 */

   @Test

    public void test1(){
       driver.get("https://formsmarts.com/form/yu?mode=h5");
       MyMethods.myWait(2);


       WebElement discoverXYZ = driver.findElement(By.id("u_Ccq_4588"));
       Select select = new Select(discoverXYZ);//select class obj. We can select any option without clicking twice
       select.selectByVisibleText("Referred by Existing Customer");
       select.selectByValue("Offline Advertising");
     //  select.selectByIndex(1);

       int randomIndex =((int) (Math.random()*5))+1; //if you want randomly selected add this.
       select.selectByIndex(randomIndex);            //Or you can use this, Random random = new Random()








       waitAndQuit();
   }


}
