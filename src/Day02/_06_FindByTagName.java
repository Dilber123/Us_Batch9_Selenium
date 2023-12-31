package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _06_FindByTagName {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");


        List<WebElement> LinksOnAmazon = driver.findElements(By.tagName("a"));

        for(WebElement link:LinksOnAmazon) {
            System.out.println(link.getText() + ": ");   //added later
            System.out.println(link.getAttribute("href"));
        }

        driver.get("http://form.jotform.com/232258017946157");
        List<WebElement> labelsOnJotForm = driver.findElements(By.tagName("label"));//locates all the elements that have
                                                                                    //the same name

        for(WebElement link:labelsOnJotForm) {
            System.out.println(link.getText() );

        }

        MyMethods.myWait(3);
        driver.quit();


    }

}
