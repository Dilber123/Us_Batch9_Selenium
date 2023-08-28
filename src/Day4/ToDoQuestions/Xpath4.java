package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath4 extends BaseDriver {

    public static void main(String[] args) {


        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        WebElement firstInput = driver.findElement(By.xpath("//input[@id='number1']"));
        firstInput.sendKeys("20");

        WebElement secondInput = driver.findElement(By.xpath("//input[@id='number2']"));
        secondInput.sendKeys("30");

        calculateButton.click();

        WebElement resultElement = driver.findElement(By.xpath("//p[@id='answer']"));
        String resultText = resultElement.getText();

        System.out.println("Answer: " + resultText);


        waitAndQuit();



    }
}
