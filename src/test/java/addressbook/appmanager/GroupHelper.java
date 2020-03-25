package addressbook.appmanager;

import addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    WebDriver driver;

    public void initiateGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getG_name());

        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getG_header());

        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getG_footer());
    }

    public void submitGroupCreationForm() {
        driver.findElement(By.name("submit")).click();
    }

    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void groupDeletion() {
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
        driver.findElement(By.linkText("groups")).click();
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
        driver.findElement(By.name("delete")).click();
    }
}
