package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


    public class cssQuestion1 extends BaseDriver {

        //Question 1 Css

        public static void main(String[] args) {


            driver.get("http:demoqa.com/text-box");

            WebElement fullNameArea = driver.findElement(By.cssSelector("input[id=\"userName\"]"));
            fullNameArea.sendKeys("Automation");

            WebElement emailArea = driver.findElement(By.cssSelector("input[id=\"userEmail\"]"));
            emailArea.sendKeys("testing@gmail.com");

            WebElement currentAddressArea = driver.findElement(By.cssSelector("textarea[id=\"currentAddress\"]"));
            currentAddressArea.sendKeys("TestingCurrentAddress");

            WebElement permanentAddressArea = driver.findElement(By.cssSelector("textarea[id=\"permanentAddress\"]"));
            permanentAddressArea.sendKeys("TestingPermanentAddress");

            WebElement submitButton = driver.findElement(By.cssSelector("button[id=\"submit\"]"));
            submitButton.click();

            //Verify that full name has "Automation" in it.
            //Verify that Email has "testing" in it.


            String fullNameText = fullNameArea.getAttribute("value");
            if (fullNameText.contains("Automation")) {
                System.out.println("Full Name contains 'Automation'");
            } else {
                System.out.println("Full Name does not contain 'Automation'");
            }

            String emailValue = emailArea.getAttribute("value");
            if (emailValue.contains("testing")) {
                System.out.println("Email contains 'testing'.");
            } else {
                System.out.println("Email does not contain 'testing'.");
            }

            waitAndQuit();

        }


    }



