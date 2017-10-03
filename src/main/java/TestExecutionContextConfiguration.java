import com.homeaway.repository.CustomerRepository;
import com.homeaway.repository.HibernateCustomerRepositoryImpl;
import com.homeaway.service.TestExecutionContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestExecutionContextConfiguration {

    @Bean
    public TestExecutionContext testContext() {
        String environment = "Test";

        String site = "HOMEAWAY_US";

        return new TestExecutionContext(environment, site);
    }

    @Bean
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();

        }
    }


