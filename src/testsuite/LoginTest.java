package testsuite;
/**
 * This is the programme for login functionality
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
     String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
     @Before
     public void setup( ){
         openBrowser(baseUrl);
     }
@Test
// This method is for login functionality check
public void userShouldLoginSuccessfullyWithValidCredentials() {

    driver.findElement(By.name("username")).sendKeys("Admin");      // Enter the username in username field
    driver.findElement(By.name("password")).sendKeys("admin123");   // Enter the password in the password field
    driver.findElement(By.xpath("//button[@type='submit']")).click();   // Click in login Button
    String expectedSuccessfullyLoginMessage = "Dashboard";          // Message display after successfully login
    WebElement actualsucessfullogintextelement = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
    String actualsucessfullogintextmessage = actualsucessfullogintextelement.getText();
    Assert.assertEquals("Error message", expectedSuccessfullyLoginMessage, actualsucessfullogintextmessage);

}
    @After
    public void tearDoem() {
        driver.close();
    }
}

