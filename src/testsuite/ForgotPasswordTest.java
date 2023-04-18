package testsuite;
/**
 * This programme is for reset Password.
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Before
    public void setup( ){
        openBrowser(baseUrl);
    }
    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        String exceptedForgotPasswordMessage = "Reset Password";
        WebElement actualForgotPasswordTextElement = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
        String actualForgotPasswordTextMessage = actualForgotPasswordTextElement.getText();
        Assert.assertEquals("Error message",exceptedForgotPasswordMessage, actualForgotPasswordTextMessage);  // Verify the excepted and actual text message to confirm
    }
    @After
    public void tearDoem() {
        driver.close();
    }
}


