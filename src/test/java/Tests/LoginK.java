package Tests;

import Help.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//mosteneste driverul din BaseTest
public class LoginK extends BaseTest {

    public String emailvalue;
    public String passwordvalue;

    @Test

    public void test1() {
        // validarea pagina de Register
        String expectedpaginaderesiter = "Register";
        String actualpaginaderegister = driver.getTitle();
        Assert.assertEquals(expectedpaginaderesiter, actualpaginaderegister);

        //din registerpage dam click pe home button
        WebElement homebutton = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        homebutton.click();

        // validarea Homepage
        String expectedhomepage = "Index";
        String actualhomepage = driver.getTitle();
        Assert.assertEquals(expectedhomepage, actualhomepage);

        //dam click pe signin button
        WebElement signinbutton = driver.findElement(By.xpath("//button[@id='btn1']"));
        signinbutton.click();

        //validam pagina signin
        String expectedsigninpage = BaseTest.getvalue("Loginpagetitle");
        String actualsigninpage = driver.getTitle();
        Assert.assertEquals(expectedsigninpage, actualsigninpage);

        //parsez valorile pentru mail


        emailvalue="" +BaseTest.getvalue("emailvalues");
        passwordvalue=""+BaseTest.getvalue("passwordvalues");
        String[] parseEmail=emailvalue.split(",");
        String[] parsePassword=passwordvalue.split(",");




        for (int index = 0; index < 3; index++) {
            WebElement emailfield1 = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
            WebElement passwordfield1 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            WebElement enterbutton1 = driver.findElement(By.xpath("//img[@id='enterbtn']"));
            String emailvalue = "";
            String passwordvalue = "";

            //1. email si parola invalide

            if (index == 0) {
                emailvalue = parseEmail[0];
                passwordvalue = parsePassword[0];
                emailfield1.sendKeys(emailvalue);
                passwordfield1.sendKeys(passwordvalue);
                enterbutton1.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();

            }

            if (index == 1) {
                emailvalue = "fghfh";
                passwordvalue = "000";
                emailfield1.sendKeys(emailvalue);
                passwordfield1.sendKeys(passwordvalue);
                enterbutton1.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }


            if (index == 2) {
                emailvalue = "fghfh";
                passwordvalue = "Test123";
                emailfield1.sendKeys(emailvalue);
                passwordfield1.sendKeys(passwordvalue);
                enterbutton1.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }


        }
    }

}