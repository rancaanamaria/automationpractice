package Tests;

import Help.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TemaLogin extends BaseTest {

    public String emailvalue1;
    public String passwordvalue1;
    public String emailvalue2;
    public String passwordvalue2;
    public String emailvalue3;
    public String passwordvalue3;

    @Test

    public void test() {

        String expectedpaginaderesiter = "Register";
        String actualpaginaderegister = driver.getTitle();
        Assert.assertEquals(expectedpaginaderesiter, actualpaginaderegister);


        WebElement homebutton = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        homebutton.click();

        String expectedhomepage = "Index";
        String actualhomepage = driver.getTitle();
        Assert.assertEquals(expectedhomepage, actualhomepage);


        WebElement signinbutton = driver.findElement(By.xpath("//button[@id='btn1']"));
        signinbutton.click();


        String expectedsigninpage = BaseTest.getvalue("Loginpagetitle");
        String actualsigninpage = driver.getTitle();
        Assert.assertEquals(expectedsigninpage, actualsigninpage);


        emailvalue1 = "" + BaseTest.getvalue("emailvalues1");
        passwordvalue1 = "" + BaseTest.getvalue("passwordvalues1");
        String[] parseEmail1 = emailvalue1.split(",");
        String[] parsePassword1 = passwordvalue1.split(",");

        //1. email si parola invalide

        for (int index = 0; index < 5; index++) {
            WebElement emailfield1 = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
            WebElement passwordfield1 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            WebElement enterbutton1 = driver.findElement(By.xpath("//img[@id='enterbtn']"));
            String emailvalue1 = "";
            String passwordvalue1 = "";


            if (index == 0) {
                emailvalue1 = parseEmail1[0];
                passwordvalue1 = parsePassword1[0];
                emailfield1.sendKeys(emailvalue1);
                passwordfield1.sendKeys(passwordvalue1);
                enterbutton1.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();

            }

            if (index == 1) {
                emailvalue1 = parseEmail1[1];
                passwordvalue1 = parsePassword1[1];
                emailfield1.sendKeys(emailvalue1);
                passwordfield1.sendKeys(passwordvalue1);
                enterbutton1.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }


            if (index == 2) {
                emailvalue1 = parseEmail1[2];
                passwordvalue1 = parsePassword1[2];
                emailfield1.sendKeys(emailvalue1);
                passwordfield1.sendKeys(passwordvalue1);
                enterbutton1.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }


            if (index == 3) {
                emailvalue1 = parseEmail1[3];
                passwordvalue1 = parsePassword1[3];
                emailfield1.sendKeys(emailvalue1);
                passwordfield1.sendKeys(passwordvalue1);
                enterbutton1.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }

            if (index == 4) {
                emailvalue1 = parseEmail1[2];
                passwordvalue1 = parsePassword1[4];
                emailfield1.sendKeys(emailvalue1);
                passwordfield1.sendKeys(passwordvalue1);
                enterbutton1.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }

        }

        //2. email valid si parola invalida

        emailvalue2 = "" + BaseTest.getvalue("emailvalues2");
        passwordvalue2= "" + BaseTest.getvalue("passwordvalues2");
        String[] parseEmail2 = emailvalue2.split(",");
        String[] parsePassword2 = passwordvalue2.split(",");


        for (int index = 0; index < 5; index++) {
            WebElement emailfield2 = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
            WebElement passwordfield2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            WebElement enterbutton2 = driver.findElement(By.xpath("//img[@id='enterbtn']"));
            String emailvalue2 = "";
            String passwordvalue2 = "";


            if (index == 0) {
                emailvalue2 = parseEmail2[0];
                passwordvalue2 = parsePassword2[0];
                emailfield2.sendKeys(emailvalue2);
                passwordfield2.sendKeys(passwordvalue2);
                enterbutton2.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();

            }

            if (index == 1) {
                emailvalue2 = parseEmail2[1];
                passwordvalue2 = parsePassword2[1];
                emailfield2.sendKeys(emailvalue2);
                passwordfield2.sendKeys(passwordvalue2);
                enterbutton2.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }


            if (index == 2) {
                emailvalue2 = parseEmail2[2];
                passwordvalue2 = parsePassword2[2];
                emailfield2.sendKeys(emailvalue2);
                passwordfield2.sendKeys(passwordvalue2);
                enterbutton2.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();


            }

            if (index == 3) {
                emailvalue2 = parseEmail2[3];
                passwordvalue2 = parsePassword2[3];
                emailfield2.sendKeys(emailvalue2);
                passwordfield2.sendKeys(passwordvalue2);
                enterbutton2.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }

            if (index == 4) {
                emailvalue2 = parseEmail2[3];
                passwordvalue2 = parsePassword2[1];
                emailfield2.sendKeys(emailvalue2);
                passwordfield2.sendKeys(passwordvalue2);
                enterbutton2.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }
        }

        //3. email invalid si parola valida

        emailvalue3 = "" + BaseTest.getvalue("emailvalues3");
        passwordvalue3= "" + BaseTest.getvalue("passwordvalues3");
        String[] parseEmail3 = emailvalue3.split(",");
        String[] parsePassword3 = passwordvalue3.split(",");


        for (int index = 0; index < 5; index++) {
            WebElement emailfield3 = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
            WebElement passwordfield3 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            WebElement enterbutton3 = driver.findElement(By.xpath("//img[@id='enterbtn']"));
            String emailvalue3 = "";
            String passwordvalue3 = "";


            if (index == 0) {
                emailvalue3 = parseEmail3[0];
                passwordvalue3 = parsePassword3[0];
                emailfield3.sendKeys(emailvalue3);
                passwordfield3.sendKeys(passwordvalue3);
                enterbutton3.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();

            }

            if (index == 1) {
                emailvalue3 = parseEmail3[1];
                passwordvalue3 = parsePassword3[1];
                emailfield3.sendKeys(emailvalue3);
                passwordfield3.sendKeys(passwordvalue3);
                enterbutton3.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }


            if (index == 2) {
                emailvalue3 = parseEmail3[2];
                passwordvalue3 = parsePassword3[2];
                emailfield3.sendKeys(emailvalue3);
                passwordfield3.sendKeys(passwordvalue3);
                enterbutton3.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();


            }

            if (index == 3) {
                emailvalue3 = parseEmail3[3];
                passwordvalue3= parsePassword3[3];
                emailfield3.sendKeys(emailvalue3);
                passwordfield3.sendKeys(passwordvalue3);
                enterbutton3.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }

            if (index == 4) {
                emailvalue3 = parseEmail3[2];
                passwordvalue3 = parsePassword3[0];
                emailfield3.sendKeys(emailvalue3);
                passwordfield3.sendKeys(passwordvalue3);
                enterbutton3.click();
                WebElement errormessage = driver.findElement(By.xpath("//label[@id='errormsg']"));
                String expectederrormessage = BaseTest.getvalue("Errormessage");
                String actualerrormessage = errormessage.getText();
                Assert.assertEquals(expectederrormessage, actualerrormessage);
                driver.navigate().refresh();
            }
        }



    }
}