package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssQuestion4 extends BaseDriver {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateButton = driver.findElement(By.cssSelector("a [id=\"calculatetest\"]"));
        calculateButton.click();

        WebElement firstInput = driver.findElement(By.cssSelector("input[id=\"number1\"]"));
        firstInput.sendKeys("25");

        WebElement secondInput = driver.findElement(By.cssSelector("input[id=\"number2\"]"));
        secondInput.sendKeys("30");

        calculateButton.click();


        WebElement result = driver.findElement(By.id("answer"));
        String expectedResult = "55";

        String actualResult = result.getText();


        if (actualResult.equals(expectedResult)) {
            System.out.println("Test Passed! The result is correct");

        } else {
            System.out.println("Test Failed");
        }

         waitAndQuit();
    }
}