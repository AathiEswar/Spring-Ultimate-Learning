package com.spring.starter.starter01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    @Primary
    public Person person(){
        return new Person("Xioa" , 2000 , new Address("Kolkata" , "India"));
    }
    @Bean
    public Person personParameters(String name, int age,@Qualifier("address2") Address address){
        return new Person(name , age , address);
    }
    @Bean
    public Person personMethodCall(){
        return new Person(name() , age() , address());
    }

    @Bean(name = "address1")
    // primary let it be the top choice for auto wiring( dependency injection)
    @Primary
    public Address address(){
        return new Address("Tamil Nadu" , "India");
    }

    @Bean
    // Qualifier - Helps for Manual Auto wiring( dependency injection)
    @Qualifier("address2")
    public Address address2(){
        return new Address("Mumbai" , "India");
    }


}
