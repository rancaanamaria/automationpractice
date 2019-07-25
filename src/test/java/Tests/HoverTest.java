package Tests;

import Help.BaseTest;
import Help.Helpermethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverTest extends BaseTest {

   // declaram un obiect de tip Helperethods

    public Helpermethods functions = new Helpermethods(driver);

    @Test

    public void test() {

        // hover pe SwitchTo menu button

        WebElement switchbutton = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
        Actions action = new Actions(driver);
        action.moveToElement(switchbutton).build().perform();

        WebElement windowsbutton = driver.findElement(By.xpath("//a[contains(text(), 'Windows')]"));
        new WebDriverWait(driver,4500).until(ExpectedConditions.visibilityOf(windowsbutton));
        functions.clickmethod(windowsbutton);

    }




}
