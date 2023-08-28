package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com/");

        String url1 = driver.getCurrentUrl();
        WebElement careersLink = driver.findElement( By.linkText("Careers"));//We use it for a tag elements.
                                                      //Locates the elements by using their visible text
        System.out.println("careersLink.getText() =" + careersLink.getText());

        System.out.println("careersLink.getAttribute(\"href|) =" + careersLink.getAttribute("href"));
        System.out.println("careersLink.getAttribute(\"href|) =" + careersLink.getAttribute("class"));

     // let us use click method, url method

        careersLink.click(); //clicks on the element

        String url2 = driver. getCurrentUrl(); //gets the current url on the browser
        System.out.println("url =" + url2);

//      let us check if 2 urls equal

        if(!url1.equals(url2)) {               //if you are comparing 2 url
            System.out.println("test is passed");//if urls different
        }else{
            System.out.println("test is failed");
        }



         MyMethods.myWait(3);
         driver.quit();





    }
}
