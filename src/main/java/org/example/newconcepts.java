package org.example;

import org.testng.annotations.Test;

import java.awt.event.KeyEvent;

public class newconcepts
{

    @Test
    public void Login()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //WebDriver driver=new FirefoxDriver();
        JavascriptExecutor js=(JavascriptExecutor)driver;

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement button=driver.findElement(By.xpath("//button [@type='submit']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin@123");

        Assert.assertEquals("org.openqa.selenium.NoSuchElementException","https://opensource-demo.orangehrmlive.com/web/index.php/auth/lo");

        js.executeScript("arguments[0].click();", button);

        js.executeScript("alert('Welcome to orange hrm');");
    }
}