package com.spring.dependencyInjection.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Contra")
public class ContraGame implements GameConsole {

    public void up(){
        System.out.println("Move Front");
    }
    public void down(){
        System.out.println("Move Back");
    }
    public void left(){
        System.out.println("Move Left");
    }
    public void right(){
        System.out.println("Move Right");
    }
}
