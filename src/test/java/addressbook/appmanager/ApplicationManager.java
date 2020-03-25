package addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private final GroupHelper groupHelper = new GroupHelper();

    public void init() {
        groupHelper.driver = new FirefoxDriver();
        groupHelper.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        groupHelper.driver.get("http://localhost:8080/addressbook/index.php");
        groupHelper.driver.manage().window().setSize(new Dimension(1200, 753));

        loginAB("admin", "secret");
    }

    public void stop() {
        groupHelper.driver.quit();
    }

    public void loginAB(String username, String pass) {
        groupHelper.driver.findElement(By.name("user")).click();
        groupHelper.driver.findElement(By.name("user")).clear();
        groupHelper.driver.findElement(By.name("user")).sendKeys(username);
        groupHelper.driver.findElement(By.name("pass")).click();
        groupHelper.driver.findElement(By.name("pass")).clear();
        groupHelper.driver.findElement(By.name("pass")).sendKeys(pass);
        groupHelper.driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    public void goToGroupPage() {
        groupHelper.driver.findElement(By.linkText("groups")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
