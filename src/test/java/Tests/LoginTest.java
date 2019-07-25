package Tests;

import Help.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test

    public void test1 () {

        WebElement homebutton = driver.findElement(By.xpath("//a[@href='Index.html']"));
        homebutton.click();

        WebElement singinbutton = driver.findElement(By.xpath("//button[@id='btn1']"));
        singinbutton.click();

        String expectedloginpagevalue = BaseTest.getvalue("Loginpagetitle");
        String actualloginpagevalue = driver.getTitle();
        Assert.assertEquals(expectedloginpagevalue, actualloginpagevalue);

        // logare fara completarea campurilor Email & Pass

//        String emailaddressvalue = "";
//        WebElement emailfield = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
//        emailfield.sendKeys(emailaddressvalue);
//        String passvalue = "";
//        WebElement passfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//        passfield.sendKeys(passvalue);
//        WebElement enterbutton = driver.findElement(By.xpath("//img[@id='enterbtn']"));
//        enterbutton.click();
//        WebElement errormsg = driver.findElement(By.xpath("//label[@id='errormsg']"));
//        Assert.assertTrue("Invalid User Name or PassWord", errormsg.isDisplayed());

        // logare cu mail valid si parola invalida

//        String emailaddressvalue = "ranca.ana28@gmail.com";
//        WebElement emailfield = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
//        emailfield.sendKeys(emailaddressvalue);
//        String passvalue = "!";
//        WebElement passfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//        passfield.sendKeys(passvalue);
//        WebElement enterbutton = driver.findElement(By.xpath("//img[@id='enterbtn']"));
//        enterbutton.click();
//        WebElement errormsg = driver.findElement(By.xpath("//label[@id='errormsg']"));
//        Assert.assertTrue("Invalid User Name or PassWord", errormsg.isDisplayed());

        // logare cu mail invalid si parola valida

//        String emailaddressvalue = "@";
//        WebElement emailfield = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
//        emailfield.sendKeys(emailaddressvalue);
//        String passvalue = "Ana1992";
//        WebElement passfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//        passfield.sendKeys(passvalue);
//        WebElement enterbutton = driver.findElement(By.xpath("//img[@id='enterbtn']"));
//        enterbutton.click();
//        WebElement errormsg = driver.findElement(By.xpath("//label[@id='errormsg']"));
//        Assert.assertTrue("Invalid User Name or PassWord", errormsg.isDisplayed());

        // logare cu valori invalide pentru ambele campuri

//        String emailaddressvalue = "ana28@com";
//        WebElement emailfield = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
//        emailfield.sendKeys(emailaddressvalue);
//        String passvalue = "Ana!12";
//        WebElement passfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//        passfield.sendKeys(passvalue);
//        WebElement enterbutton = driver.findElement(By.xpath("//img[@id='enterbtn']"));
//        enterbutton.click();
//        WebElement errormsg = driver.findElement(By.xpath("//label[@id='errormsg']"));
//        Assert.assertTrue("Invalid User Name or PassWord", errormsg.isDisplayed());


        //logare cu caractere speciale

//        String emailaddressvalue = "@&*";
//        WebElement emailfield = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
//        emailfield.sendKeys(emailaddressvalue);
//        String passvalue = "!1@";
//        WebElement passfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//        passfield.sendKeys(passvalue);
//        WebElement enterbutton = driver.findElement(By.xpath("//img[@id='enterbtn']"));
//        enterbutton.click();
//        WebElement errormsg = driver.findElement(By.xpath("//label[@id='errormsg']"));
//        Assert.assertTrue("Invalid User Name or PassWord", errormsg.isDisplayed());

        // logare cu spatii


        
        String emailaddressvalue = "     ";
        WebElement emailfield = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
        emailfield.sendKeys(emailaddressvalue);
        String passvalue = "     ";
        WebElement passfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passfield.sendKeys(passvalue);
        WebElement enterbutton = driver.findElement(By.xpath("//img[@id='enterbtn']"));
        enterbutton.click();
        WebElement errormsg = driver.findElement(By.xpath("//label[@id='errormsg']"));
        String actualerrormessage = BaseTest.getvalue("Errormessage");
        String expectederrormessage = errormsg.getText();
        Assert.assertTrue(actualerrormessage.equals(expectederrormessage));


        //refresh, clear








    }
}
