package user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.DataServices;
import services.MongoUserServices;

@Configuration
public class ApplictionConfiguration {
    @Bean(name = "UserServices")
    public UserServices getUser() {
        return new UserServices();
    }

    @Bean
    public MongoUserServices getMongoUserServices(DataServices mongoService) {
        return new MongoUserServices(mongoService);
    }

    @Bean
    public DataServices getDataServices() {
        return new DataServices();
    }

}
