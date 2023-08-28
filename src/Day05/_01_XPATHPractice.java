package Day05;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_XPATHPractice extends BaseDriver {


        /**go to "https://www.saucedeme.com/"
         * Login
         * Click on Sauce Labs Backpack and add it to cart
         * Go back
         * Click on Cart
         * Click on check out
         * Verify that total amount is equal to the sum of the products in the cart
         * <p>
         * Use XPath
         **/

        @Test

        public void checkOutTest(){

            driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("standard_user");   //username

        WebElement password = driver.findElement(By.xpath("//input[@data-test='password']"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type=\"submit\" and @id=\"login-button\"]"));
        loginButton.click();

        WebElement product1 = driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]"));
        product1.click();

        WebElement addToCart1 = driver.findElement(By.xpath("//button[starts-with(@id,\"add-to-cart\")]"));
        addToCart1.click();

        driver.navigate().back();

        WebElement product2 = driver.findElement(By.xpath("//div[text()=\"Sauce Labs Bolt T-Shirt\"]"));
        product2.click();

        WebElement addToCart2 = driver.findElement(By.xpath("//button[starts-with(@id,\"add-to-cart\")]"));
        addToCart2.click();

        driver.navigate().back();

        WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartButton.click();

        WebElement checkOutButton = driver.findElement(By.xpath("//button[starts-with9@id,\"add-to-cart\")]"));
        checkOutButton.click();

        WebElement firstNameInput =driver.findElement(By.xpath("//input[@id='first-name']"));
        firstNameInput.sendKeys("Batch9");

        WebElement lastNameInput =driver.findElement(By.xpath("//input[@id='last-name']"));
        lastNameInput.sendKeys("The Best");

        WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("845216");

        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();

        driver.findElement(By.xpath("//div[@class='inventory_item_price']"));

        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double total =0.0;
          for(WebElement element:priceList)  {
              total+= Double.parseDouble( element.getText().substring(1));

          }
        WebElement subTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String subTotalString=subTotal.getText(). replaceAll("[^0-9,.]","");//replaces everything other
                                                                                            //then numbers and "."
        Double subTotalDouble = Double.parseDouble(subTotalString);

  //         Assert.assertEquals(subTotalDouble, total);
         //   Assert.assertTrue(subTotalDouble==total);

            waitAndQuit();

    }


}





