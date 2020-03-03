package com.telran.trello.manager;

import com.telran.trello.model.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SessionHelper extends HelperBase {


    public SessionHelper(AppiumDriver driver) {
        super(driver);
    }

    public void firstLoginButton() {
        tap(By.id("log_in_button"));
    }

    public void fillLogInForm(User user) throws InterruptedException {
        type(By.id("user"), user.getUserName());
        Thread.sleep(6000);
        type(By.id("password"), user.getPassword());
        driver.hideKeyboard();
    }

    public void tapLoginButton() {
        tap(By.id("authenticate"));
//        tap(By.xpath("//*[contains(text(), 'LOGIN')]"));
    }

    public void clickOnName() {
        tap(By.xpath("//*[contains(text(), 'romich87')]"));
        tap(By.xpath("//*[contains(text(), 'romich87')]"));
        tap(By.xpath("//*[contains(text(), 'romich87')]"));
    }

    public void confirmAtlassianLogin(User user) throws InterruptedException {
        WebElement popUp = driver.findElement(By.id("parentPanel"));
        popUp.findElement(By.xpath(".//*[@resource-id='android:id/button1']")).click();
        pause(20000);
        if (isElementPresent(By.xpath(".//*[@resource-id='username']"))) {
            driver.findElement(By.xpath(".//*[@resource-id='username']")).clear();
            type(By.xpath(".//*[@resource-id='username']"), "romich87@gmail.com");

            pause(3000);
            tap(By.xpath(".//*[@resource-id='login-submit']"));
            pause(3000);
            type(By.xpath("//*[@resource-id='password']"), user.getPassword());
            driver.hideKeyboard();
            pause(10000);
            tap(By.xpath("//*[@resource-id='login-submit']"));
            pause(20000);
        }
        if (isElementPresent(By.xpath("//android.view.View[@class='android.widget.Image']"))) {
            tap(By.xpath("//android.view.View[@class='android.widget.Image']"));
            pause(20000);
        }
//        if (isElementPresent(By.xpath("//android.view.View[@content-desc='romich87@gmail.com']"))) {
//            tap(By.xpath("//android.view.View[@content-desc='romich87@gmail.com']"));
//            pause(20000);
//        }
    }


}
