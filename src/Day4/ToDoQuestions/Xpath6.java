package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath6 extends BaseDriver {
    public static void main(String[] args) {


        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Find the "Fake Alerts" link by XPath and click it
        WebElement fakeAlertsLink = driver.findElement(By.xpath("//a[contains(text(), 'Fake Alerts')]"));
        fakeAlertsLink.click();

        // Find the "Show Modal Dialog" button by XPath and click it
        WebElement showModalDialogButton = driver.findElement(By.xpath("//input[@value='Show Modal Dialog']"));
        showModalDialogButton.click();

        // Switch to the alert dialog and accept it (click OK)
        driver.switchTo().alert().accept();


        waitAndQuit();
    }
}










