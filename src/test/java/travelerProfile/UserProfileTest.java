package travelerProfile;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.UserContextConfiguration;
import utils.UserContext;

@ContextConfiguration(classes = {UserContextConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserProfileTest {

    public static String user;


    @Autowired
    protected UserContext userContext;

    @Test
    public void user_profile() throws Throwable {
        user = userContext.getUser();
        System.out.println(user);

        System.out.println("this is testing 3");
    }

}
