package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.homeaway.repository.CustomerRepository;
import com.homeaway.repository.HibernateCustomerRepositoryImpl;

import utils.TestExecutionContext;

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


