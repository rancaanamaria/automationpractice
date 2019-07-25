package Help;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public static Properties property;
    public FileInputStream file;


    @Before
    public void setup () throws FileNotFoundException {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

//        // Wait implicit - pe o anumita zona
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loadproperty();
    }


    //metoda care iti incarca fisierul de proprietati

    public void loadproperty() throws FileNotFoundException {

        property = new Properties();
        file = new FileInputStream("C:\\Users\\toshiba\\IdeaProjects\\ProbaAutomation\\src\\test\\resources\\InputData.properties");
        try {
            property.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // metoda care returneaza valoarea dintr-un fisier properties pe baza unei chei

    public static String getvalue(String key) {

        return property.getProperty(key);
    }




//    @After
//    public void finish () {
//
//        driver.quit();
//    }








}
