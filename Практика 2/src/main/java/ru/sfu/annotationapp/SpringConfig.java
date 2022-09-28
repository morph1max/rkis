package ru.sfu.annotationapp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.sfu.annotationapp")
@PropertySource("classpath:humanDirectorFile.properties")
public class SpringConfig {

    @Bean
    public Human beanHuman() {
        return new Human("");
    }

    @Bean
    public Theatre beanTheatre1() {
        return new Theatre(beanHuman());
    }

    @Bean
    public GroupManagers beanGroupManager() {
        return GroupManagers.createGroupManager();
    }

    @Bean
    public Theatre beanTheatre2() {
        return new Theatre(beanGroupManager());
    }

}
