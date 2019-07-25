package Tests;

import Help.BaseTest;
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


public class WebElementTest extends BaseTest {


    @Test
    public void start3() {



        //validam Register page (Home page was displayed)

        String expectedregister= "Register";
        String actualregister=driver.getTitle();
        Assert.assertEquals(expectedregister,actualregister);


        //completez First Name field

        String firstnamevalue= "Ana-Maria";
        WebElement firstnameweb=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstnameweb.sendKeys(firstnamevalue);

        // completez Last Name field

        String lastnamevalue= "Ranca";
        WebElement lastnameweb=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastnameweb.sendKeys(lastnamevalue);

        //completez Address field

        String addressvalue= "1354 W Ohio Street";
        WebElement addressweb=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        addressweb.sendKeys(addressvalue);

        //completez Email address field

        String emailaddressvalue= "bby.anita@yahoo.com";
        WebElement emailaddressweb=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
        emailaddressweb.sendKeys(emailaddressvalue);

//        String emailvalue = System.currentTimeMillis()+"gmail.com";


        //completez Phone field

        String phonevalue = System.currentTimeMillis()+"";
        String newphone = phonevalue.substring(1,11);
        WebElement phoneweb = driver.findElement(By.xpath("//input[@type='tel']"));
        phoneweb.sendKeys(newphone);


//        String phonevalue="0752210029";
//        WebElement phoneweb=driver.findElement(By.xpath("//input[@type='tel']"));
//        phoneweb.sendKeys(phonevalue);

        //bifam Male


        WebElement maleweb=driver.findElement(By.xpath("//input[@value='Male']"));
        maleweb.click();

        //bifam FeMale

        WebElement femaleweb=driver.findElement(By.xpath("//input[@value='FeMale']"));
        femaleweb.click();

        //bifam Cricket

        WebElement cricketweb=driver.findElement(By.xpath("//input[@value='Cricket']"));
        cricketweb.click();

        //bifam Movies

        WebElement moviesweb= driver.findElement(By.xpath("//input[@id='checkbox2']"));
        moviesweb.click();

        //bifam Hockey

        WebElement hockeyweb=driver.findElement(By.xpath("//input[@id='checkbox3']"));
        hockeyweb.click();

        //alegem limba

//        WebElement languagesweb=driver.findElement(By.xpath("//div[@id='msdd']"));
//        languagesweb.click();


        // Languages dropdown list
        driver.findElement(By.id("msdd")).click();
        List<WebElement> languages=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
        for(int i=0;i<languages.size();i++)
        {
            System.out.println(languages.get(i).getText());
            if(languages.get(i).getText().equalsIgnoreCase("Arabic"))
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
        Select selectcountryselect= new Select(selectcountrydropdown);
        selectcountryselect.selectByValue(selectcountryvalue);


//        List<WebElement> hobbyweb=driver.findElements(By.xpath("//input[@type='checkbox']"));
//        for (int contor=0;contor<hobbyweb.size(); contor++){
//            String curentelement = hobbyweb.get(contor).getAttribute("value");
//            if(curentelement.contains("Movies")){
//                hobbyweb.get(contor).click();
//            }
//        }

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

        WebElement daydropwdown= driver.findElement(By.xpath("//select[@placeholder='Day']"));
        String dayvalue= "28";
        Select dayselect= new Select(daydropwdown);
        dayselect.selectByValue(dayvalue);

        //introducem prima parola

        String primaparolavalue= "Ana1234";
        WebElement primaparolaweb=driver.findElement(By.xpath("//input[@id='firstpassword']"));
        primaparolaweb.sendKeys(primaparolavalue);

        //introducem a doua parola

        String adouaparolavalue="Ana1234";
        WebElement adouaparolaweb=driver.findElement(By.xpath("//input[@id='secondpassword']"));
        adouaparolaweb.sendKeys(adouaparolavalue);

        //click pe butonul Submit

        WebElement submitweb=driver.findElement(By.xpath("//button[@id='submitbtn']"));
        submitweb.click();

        //click pe butonul Refresh
//
//        WebElement refreshweb=driver.findElement(By.xpath("//button[@id='Button1']"));
//        refreshweb.click();


//        String expectedmessage= "Register";
//        WebElement message=driver.findElement(By.xpath("//h2"));
//        String actualmessage= message.getText();
//        Assert.assertTrue(expectedmessage.equals(actualmessage));


//       WebElement imageWebElement=driver.findElement(By.xpath("*[@id='\imagetrgt\']));
//                if(imageWebElement.isDisplayed())
//        {
//            Assert.assertTrue(imageWebElement.isDisplayed());
//        }





            //validarea ca suntem pe pagina noua

        WebElement messageweb = driver.findElement(By.xpath("//h4[1]"));

           //Wait Explicit
//        new WebDriverWait(driver,7500).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[1]")));

//        Thread.sleep(4500);
//
        Assert.assertTrue("The message is not displayed",messageweb.isDisplayed());










    }


}
