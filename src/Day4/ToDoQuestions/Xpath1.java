package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath1 extends BaseDriver {

    public static void main(String[] args) {


        driver.get("http://demoqa.com/text-box");

        WebElement fullNameField = driver.findElement(By.xpath("//input[@id='userName']"));
        fullNameField.sendKeys("Automation");

        WebElement emailField = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailField.sendKeys("testing@gmail.com");

        WebElement currentAddressField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddressField.sendKeys("Testing Current Address");

        WebElement permanentAddressField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddressField.sendKeys("Testing Permanent Address");

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();


        String fullNameValue = fullNameField.getAttribute("value");

        if (fullNameValue.contains("Automation")) {
            System.out.println("Full Name contains 'Automation'");
        } else {
            System.out.println("Full Name does not contain 'Automation'");
        }

        String emailValue = emailField.getAttribute("value");

        if (emailValue.contains("testing")) {
            System.out.println("Email contains 'testing'");
        } else {
            System.out.println("Email does not contain 'testing'");
        }



        waitAndQuit();


    }
}




