package com.spring.starter.starter01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Mentions this class will be responsible for the configurations
@Configuration
public class Starter01Configuration {
    // @Bean - is managed by the Spring IoC Container
    @Bean
    public String name(){
        return "Aathi Eswar";
    }
    @Bean
    public int age(){
        return 21;
    }
    @Bean(name = "personRecord")
    public Person person(){
        return new Person("Xioa" , 2000 , new Address("Kolkata" , "India"));
    }
    @Bean
    public Person personParameters(String name, int age, Address address1){
        return new Person(name , age , address1);
    }
    @Bean
    public Person personMethodCall(){
        return new Person(name() , age() , address());
    }
    @Bean(name = "address1")
    public Address address(){
        return new Address("Tamil Nadu" , "India");
    }
}
