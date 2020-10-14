package com.shankar.practice.springwebapp.config;

import com.shankar.practice.springwebapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:greetings.properties")
public class PropertyConfig {

    @Value("${greeting.message}")
    private String greetingMessage;

    //Create a Greeting Service Bean with the injected property value
    @Bean
    public GreetingService getGreetingService(){
        GreetingService greetingService = new GreetingService();
        greetingService.setGreetings(greetingMessage);
        return greetingService;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}
