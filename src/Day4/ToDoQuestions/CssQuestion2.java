package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssQuestion2 extends BaseDriver {

    public static void main(String[] args) {

      //  WebDriver driver =new ChromeDriver();
        driver.get( "https://demo.applitools.com/");

        WebElement usernameField = driver.findElement(By.cssSelector("input[placeholder=\"Enter your username\"]"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[id=\"password\"]"));
        WebElement signInButton = driver.findElement(By.cssSelector("input[id=\"log-in\"]"));
                                                                    //or  div[class="buttons-w"]>a
        WebElement branchCloseText = driver.findElement(By.cssSelector("h6[id=\"time\"])]"));
        String text = branchCloseText.getText();


        usernameField.sendKeys("ttechno@gmail.com");
        passwordField.sendKeys("techno123.");

        signInButton.click();

        waitAndQuit();

    }

}
