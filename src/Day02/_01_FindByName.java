package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _01_FindByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://form.jotform.com/232258017946157");


        //Locators in Selenium

        // By.id               //->1st choice because it is unique for each element
        // By.name
        // By. className
        // LinkText            //->if the element is a link(a tag)  you see whole link
        // partialLinkText     //->if the element is a link(a tag)  you see just some part of the link
        // tagName
        // cssSelector
        // xpath               //-> last choice. Bec it works slower than the others. But it is the most efficient one.

        //if I cannot locate the element with the first 6,we use cssSelector, if it is not enough use xpath



        MyMethods.myWait(3);
        WebElement firstName = driver.findElement(  By.name( "q3_fullName[first]" ));
        firstName.sendKeys("John");

        MyMethods.myWait(3);
        WebElement lastName = driver.findElement(By.id("q3_fullName[first]"));
        lastName.sendKeys("Snow");


        MyMethods.myWait(3);
        firstName.clear();//if there is a text in the input field deletes it
        firstName.sendKeys(" George ");

        MyMethods.myWait(3);
        lastName.clear();
        lastName.sendKeys("Cooleney");


        MyMethods.myWait(3);
        driver.quit();
    }
}
