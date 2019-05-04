package demo.config;

import demo.services.HelloWorldService;
import demo.services.HelloWorldServiceEnglishImlp;
import demo.services.HelloWorldSeviceSpanishImlp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglishImlp(){
        return new HelloWorldServiceEnglishImlp();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldSeviceSpanishImlp(){
        return new HelloWorldSeviceSpanishImlp();
    }

}
