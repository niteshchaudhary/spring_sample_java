import com.homeaway.service.TestExecutionContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

@ContextConfiguration(classes = {
        TestExecutionContextConfiguration.class
})
@RunWith(SpringJUnit4ClassRunner.class)


public class ApplicationTest {

    public static String site;
    public static String env;


    @Autowired
    protected TestExecutionContext testExecutionContext;

    @Test
    public void traveler_profile_review_star() throws Throwable {
        site = testExecutionContext.getSite();
        env = testExecutionContext.getEnvironment();
        System.out.println(site);
        System.out.println(env);





    }


}
