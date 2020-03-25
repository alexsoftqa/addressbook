package addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void groupDeletionTest() {
        app.goToGroupPage();
        app.getGroupHelper().groupDeletion();
        app.getGroupHelper().returnToGroupPage();
    }

}






