package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {
        app.goToGroupPage();
        app.getGroupHelper().initiateGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test11211", "test21151", "test31711"));
        app.getGroupHelper().submitGroupCreationForm();
        app.getGroupHelper().returnToGroupPage();

    }

}