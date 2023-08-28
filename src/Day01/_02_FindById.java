package Day01;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _02_FindById {
    public static void main(String[] args)  {

     WebDriver driver = new ChromeDriver();
     driver. get("http://form.jotform.com/232258017946157");
     MyMethods.myWait(3);


     WebElement firstname = driver.findElement(By.id("first_3"));//locates the element by using its id
     firstname.sendKeys("John");
     MyMethods.myWait(3);



     WebElement lastname = driver.findElement(By.id("last_3"));
     lastname.sendKeys("Snow");
     MyMethods.myWait(3);

     driver.quit();


    }

}

//Thread.sleep(millis:3000); is repeated over and over  again. we create method to handle this problem.
//I created Utilities package, and under it created MyMethods. So we can now remove throws interruptedException ln:10
//and, also erase Thread.sleep, and insert MyMethods.myWait();

//I did these above