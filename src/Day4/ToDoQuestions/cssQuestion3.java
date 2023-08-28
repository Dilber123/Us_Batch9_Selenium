package Day4.ToDoQuestions;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssQuestion3 extends BaseDriver {

    public static void main(String[] args) {


        driver.get("https://www.snapdeal.com/");

    WebElement searchBox = driver.findElement(By.cssSelector("input[id\"inputValEnter\"()]"));
        searchBox.sendKeys("teddy bear");

    WebElement searchButton = driver.findElement(By.cssSelector("span[class=\"searchTextSpan\"()]"));
        searchButton.click();

    WebElement resultsText = driver.findElement(By.cssSelector("span[class=\"nnn\"()]"));


    String searchText = resultsText.getText();
        if (searchText.contains("results 'for teddy bear'")) {
        System.out.println("There are 297 teddy bears ");

    } else {
        System.out.println("There are not 297 teddy bears");
    }

    waitAndQuit();
}
}

