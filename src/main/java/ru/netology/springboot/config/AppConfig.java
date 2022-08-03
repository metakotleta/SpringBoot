package ru.netology.springboot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springboot.model.DevProfileI;
import ru.netology.springboot.model.ProdProfileI;
import ru.netology.springboot.model.ISystemProfile;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true")
    public ISystemProfile devProfile() {
        return new DevProfileI();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "false")
    public ISystemProfile prodProfile() {
        return new ProdProfileI();
    }
}
