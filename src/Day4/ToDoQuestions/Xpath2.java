package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath2 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");

        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys("ttechno@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("techno123.");


        WebElement signInButton = driver.findElement(By.xpath("//button[@id='log-in']"));
        signInButton.click();


        WebElement branchCloseText = driver.findElement(By.xpath("//h6[@id='time']"));
        String text = branchCloseText.getText();

        if (text.equals("Your nearest branch closes in: 30m 5s")) {
            System.out.println("Test is successful.");
        } else {
            System.out.println("Test is failed.");
        }

       waitAndQuit();
    }
}









