package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssQuestion5 extends BaseDriver {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get( "https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlertsLink=driver.findElement(By.cssSelector("a [id=\"fakealerttest\"]"));
        fakeAlertsLink.click();

        WebElement showAlertBox= driver.findElement(By.cssSelector("input[id=\"fakealert\"]"));
        showAlertBox.click();

        driver.switchTo().alert().accept();

        waitAndQuit();
    }
}
