package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath5 extends BaseDriver {

    public static void main(String[] args) {


        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.xpath("//a[@id='fakealerttest')]")).click();

        driver.findElement(By.xpath("//button[@value='Show Alert Box')]")).click();


        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();

        waitAndQuit();

    }
}






