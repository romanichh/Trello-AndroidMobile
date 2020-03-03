package com.telran.trello.tests;

import com.telran.trello.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void testLogin() throws InterruptedException {
        app.getSession().firstLoginButton();
        app.getSession().pause(6000);
        app.getSession().fillLogInForm(new User().withUserName("romich87").withPassword("romanich1987"));
        app.getSession().tapLoginButton();

        app.getSession().pause(8000);
        app.getSession().confirmAtlassianLogin(new User().withUserName("romich87").withPassword("romanich1987"));

//        app.getSession().pause(8000);
//        app.getSession().clickOnName();
//        app.getSession().pause(8000);

//        Assert.assertTrue(app.getPage().isTaskPresent());
    }


}
