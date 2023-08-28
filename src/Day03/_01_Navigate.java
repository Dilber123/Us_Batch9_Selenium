package Day03;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Navigate extends BaseDriver {

    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled//index.html");

        MyMethods.myWait(3);
        WebElement element =  driver.findElement(By.id("alerttest"));
        element.click();

        MyMethods.myWait(3);
        driver.navigate().back();

        MyMethods.myWait(3);
        driver.navigate().forward();

        waitAndQuit();


    }

}




//   getDriver();This part was after public static void main// I don't want to use this method all the time.
//Java comes here and sees extend. Java leaves this
// area and goes to Base class and, it runs static block first.Whatever I put between curly brackets of static
//will be executed. Java runs that part before everything. Go to that class and check the 2nd version at the top.
//public static void get driver is erased bec, I don't need it anymore
