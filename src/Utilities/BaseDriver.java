package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

     public static WebDriver driver;

    //public static void get driver is erased
    static {
        closePreviousDrivers();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();   //local variable

        driver.manage().window().maximize();//expands the driver until the edges of the screen

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        //it waits until our computer downloads all necessary files from the server. if you need you can use.
        //if it cannot download them in specified time Selenium throws an exception
        //that means there is a problem with the server site


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Waits until the browser translates all the document downloaded and convert them to html codes
        //if it cannot convert them into html in specified time period Selenium throws an exception
        //that means your application is not compatible with the browser

    }

    public static void waitAndQuit() {

        MyMethods.myWait(3);
        driver.quit();
    }

    public static void closePreviousDrivers(){
        try{
            Runtime.getRuntime().exec("taskkill/F/IM chromedriver.exe./T");
        }catch(IOException e){
            throw new RuntimeException(e);

        }

    }






}



//---------------------------------------------------------------------

//    public class BaseDriver {
//        static WebDriver driver;
//
//        public static WebDriver driver;
//
//        public static void getDriver() {         //we can call this method from Navigate.,but it doesn't turn the
//            //driver.What should we do? So we need to use extends in Navigate class.
//            //Every thing in this class becomes, Navigates classes property
//
//
//            Logger logger = Logger.getLogger("");
//            logger.setLevel(Level.SEVERE);
//
//            driver = new ChromeDriver();   //local variable
//
//            driver.manage().window().maximize();//expands the driver until the edges of the screen
//
//            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
//            //it waits until our computer downloads all necessary files from the server. if you need you can use.
//            //if it cannot download them in specified time Selenium throws an exception
//            //that means there is a problem with the server site
//
//
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//            //Waits until the browser translates all the document downloaded and convert them to html codes
//            //if it cannot convert them into html in specified time period Selenium throws an exception
//            //that means your application is not compatible with the browser
//
//        }
//
//        public static void waitAndQuit() {
//
//            MyMethods.myWait(3);
//            driver.quit();
//
//        }
//    }


//I cannot call this driver in line 35, bec it is red.We are working with the driver at the top,
// line 16 Web driver.if we are quiting, I should quit from the one at the above. I cannot quit with the one in
//line 35. What should we do?
//I should make local variable global variable. All drivers turned into red, bec method is static. Then global variable
//should be static.Now all drivers became purple, and I am able to call the quit method.