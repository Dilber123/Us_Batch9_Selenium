package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _05_FindByPartialLinkText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");


        WebElement sellProductsOnAmazon = driver.findElement(By.partialLinkText("Sell products"));//Locates the <a> tag elements
        // by using some part of their visible text
        System.out.println("sellProductsOnAmazon.getText() = " + sellProductsOnAmazon.getText());
        System.out.println("sellProductsOnAmazon.getAttribute(\"href\") = " + sellProductsOnAmazon.getAttribute("href"));
        System.out.println("sellProductsOnAmazon.getAttribute(\"class\") = " + sellProductsOnAmazon.getAttribute("class"));


        MyMethods.myWait(3);
        driver.quit();


    }
}












