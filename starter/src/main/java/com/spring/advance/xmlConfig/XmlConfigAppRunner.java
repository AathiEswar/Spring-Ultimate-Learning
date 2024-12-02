package com.spring.advance.xmlConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigAppRunner {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("context.xml")){
            System.out.println("App running with XML Config");

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean("name"));
        }
    }
}
