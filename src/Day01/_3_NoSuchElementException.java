package Day01;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_NoSuchElementException {
    public static void main(String[] args) {  //What if we use wrong id, or just "first_" It gives
                                              //thread "main" NoSuchElementException it shows the mistake "#first_"
        WebDriver driver = new ChromeDriver();
        driver.get("http://form.jotform.com/232258017946157");
        MyMethods.myWait(3);


        WebElement firstname = driver.findElement(By.id("first_"));//Selenium throws NoSuchElementException
        firstname.sendKeys("John");
        MyMethods.myWait(3);


        WebElement lastname = driver.findElement(By.id("last_3"));
        lastname.sendKeys("Snow");
        MyMethods.myWait(3);

        driver.quit();
    }
}

