package Tests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class FirstTest {

    //declaram o variabila WebDriver
    public WebDriver driver;

    //declaram o metoda
    @Test
    public void start1(){

          System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver\\chromedriver.exe");
          driver=new ChromeDriver(); // deschidem un browser
          driver.get("https://www.jdsports.co.uk/"); //accesez un link, apelez metoda
          driver.manage().window().maximize();
          driver.close();

    }

    @Test
    public void start2(){

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver(); // deschidem un browser
        driver.get("https://www.youtube.com/"); //accesez un link, apelez metoda
        driver.manage().window().maximize();
        driver.close();


    }




    @Test
    public void start3() {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        final WebDriver window = driver.switchTo().window(tabs.get(1));
        driver.get("https://www.google.com/");
        driver.close();
        driver.switchTo().window(tabs.get(0));
        driver.quit();

    }


}