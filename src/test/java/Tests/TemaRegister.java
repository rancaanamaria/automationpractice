package Tests;

import Help.BaseTest;
import Help.Helpermethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class TemaRegister extends BaseTest {

    public String firstname;
    public String lastname;
    public String address;
    public String emailaddress;
    public String phone;
    public String year;
    public String month;
    public String day;
    public String pass;
    public String passconfirm;

    public Helpermethods select = new Helpermethods(driver);


    @Test
    public void start() {


        String expectedregister = BaseTest.getvalue("Registertitle");
        select.validatepagetitle(expectedregister, driver);

        //completez First Name field

        firstname = "" + BaseTest.getvalue("firstname");
        String[] parseFirstname = firstname.split(",");

        for (int index = 0; index < 3; index++) {
            WebElement firstnameweb = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
            String firstname = "";

            if (index == 0) {
                firstname = parseFirstname[0];
                firstnameweb.sendKeys(firstname);
                driver.navigate().refresh();
            }

            if (index == 1) {
                firstname = parseFirstname[1];
                firstnameweb.sendKeys(firstname);
                driver.navigate().refresh();
            }

            if (index == 2) {
                firstname = parseFirstname[2];
                firstnameweb.sendKeys(firstname);
            }
        }

        // completez Last Name field

        lastname = "" + BaseTest.getvalue("lastname");
        String[] parseLastname = lastname.split(",");

        for (int index = 0; index < 2; index++) {
            WebElement lastnameweb = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
            String lastname = "";


            if (index == 0) {
                lastname = parseLastname[0];
                lastnameweb.sendKeys(lastname);
            }
        }

        //completez Address field

        address = "" + BaseTest.getvalue("address");
        String[] parseAddress = address.split(",");

        for (int index = 0; index < 2; index++) {
            WebElement addressweb = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
            String address = "";


            if (index == 0) {
                address = parseAddress[0];
                addressweb.sendKeys(address);
            }
        }

        //completez Email address field

        emailaddress = "" + BaseTest.getvalue("emailaddress");
        String[] parseEmailAddress = emailaddress.split(",");

        for (int index = 0; index < 2; index++) {
            WebElement emailaddressweb=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));;
            String emailaddress = "";


            if (index == 0) {
                emailaddress = parseEmailAddress[0];
                emailaddressweb.sendKeys(emailaddress);
            }
        }

        //completez Phone field

        phone = "" + BaseTest.getvalue("phone");
        String[] parsePhone = phone.split(",");

        for (int index = 0; index < 2; index++) {
          WebElement phoneweb=driver.findElement(By.xpath("//input[@type='tel']"));
          String phone = "";

          if (index == 0) {
              phone = parsePhone[0];
              phoneweb.sendKeys(phone);
          }
        }

        //bifam FeMale

        WebElement femaleweb=driver.findElement(By.xpath("//input[@value='FeMale']"));
        femaleweb.click();

        //bifam Movies

        WebElement moviesweb= driver.findElement(By.xpath("//input[@id='checkbox2']"));
        moviesweb.click();

        // Languages dropdown list

        driver.findElement(By.id("msdd")).click();
        List<WebElement> languages=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
        for(int i=0;i<languages.size();i++)
        {
            System.out.println(languages.get(i).getText());
            if(languages.get(i).getText().equalsIgnoreCase("German"))
            {
                languages.get(i).click();
                break;
            }
        }

        //slectam Skills

        WebElement skillsdropdown=driver.findElement(By.xpath("//select[@id='Skills']"));
        String skillsvalue= "Configuration";
        Select skillsselect= new Select(skillsdropdown);
        skillsselect.selectByValue(skillsvalue);

        //selectam Country

        WebElement countrydropdown=driver.findElement(By.xpath("//select[@id='countries']"));
        String countryvalue= "Oman";
        Select countryselect= new Select(countrydropdown);
        countryselect.selectByValue(countryvalue);

        //selectam Select Country

        WebElement selectcountrydropdown=driver.findElement(By.xpath("//select[@id='country']"));
        String selectcountryvalue="Japan";
        select.selectbyvaluedropdown(selectcountrydropdown, selectcountryvalue);


        //select Year

        WebElement yeardropdown=driver.findElement(By.xpath("//select[@id='yearbox']"));
        String yearvalue= "1992";
        Select yearselect= new Select(yeardropdown);
        yearselect.selectByValue(yearvalue);

        //select Month

        WebElement monthdropdown=driver.findElement(By.xpath("//select[@placeholder='Month']"));
        String monthtext= "September";
        Select monthselect= new Select(monthdropdown);
        monthselect.selectByVisibleText(monthtext);

        //select Day

        day = "" + BaseTest.getvalue("day");
        String[] parseDay = day.split(",");

        for (int index = 0; index < 30; index++) {
            WebElement daydropwdown = driver.findElement(By.xpath("//select[@placeholder='Day']"));
            String day = "";

            if (index == 0) {

                day = parseDay[0];
                daydropwdown.sendKeys(day);
            }
        }

        //introducem prima parola

        pass = "" + BaseTest.getvalue("pass");
        String[] parsePass = pass.split(",");

        for (int index = 0; index < 3; index++) {
            WebElement passweb=driver.findElement(By.xpath("//input[@id='firstpassword']"));
            String pass = "";

            if (index == 0) {

                pass = parsePass[0];
                passweb.sendKeys(pass);
            }
        }

        //confirmam parola

        passconfirm= "" + BaseTest.getvalue("pass");
        String[] parsePassconfirm = passconfirm.split(",");

        for (int index = 0; index < 3; index++) {
            WebElement passconfirmweb=driver.findElement(By.xpath("//input[@id='secondpassword']"));
            String passconfirm = "";

            if (index == 0) {

                passconfirm= parsePassconfirm[0];
                passconfirmweb.sendKeys(pass);
            }
        }


        WebElement submitweb=driver.findElement(By.xpath("//button[@id='submitbtn']"));
        submitweb.click();

//        WebElement messageweb = driver.findElement(By.xpath("//h4[1]"));
    }



}
