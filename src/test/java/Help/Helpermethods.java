package Help;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Helpermethods {

    WebDriver driver;

    // declaram un constructor

    public Helpermethods(WebDriver driver) {

        this.driver = driver;
    }

    // click method

    public void clickmethod(WebElement element) {

        element.click();
    }

    //select by value

    public void selectbyvaluedropdown(WebElement element,String value) {

        Select elementselect= new Select(element);
        elementselect.selectByValue(value);
    }

    // metoda sa validam titlul unei pagini

    public void validatepagetitle(String expectedvalue, WebDriver driver) {

        if(expectedvalue.length()>0) {
            String actualvalue = driver.getTitle();
            Assert.assertEquals(expectedvalue, actualvalue);
        }
    }


}
