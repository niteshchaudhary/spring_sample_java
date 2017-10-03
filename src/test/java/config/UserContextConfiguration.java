package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import utils.UserContext;

@Configuration
public class UserContextConfiguration {

    @Bean
    public UserContext userContext(){
        String user = "Test user";

        return new UserContext(user);
    }

}
